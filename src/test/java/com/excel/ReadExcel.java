package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public ArrayList<String> Readname() {
//		  String excelname[] = new String[10];
//		  String excelprice[] = new String[10];
	      ArrayList<String> excelname = new ArrayList<String>();

		
		String Inpath = "D:\\swigy.xlsx";
		
		FileInputStream inputStream;
	
		try {
			inputStream = new FileInputStream(new File(Inpath));
		
			 Workbook workbook = WorkbookFactory.create(inputStream);
			  Sheet sheet = workbook.getSheet("Sheet1");
			  int lastRowNum = sheet.getLastRowNum();
//			  System.out.println(lastRowNum);
			
//			  int cnt = 0 ;
			  for(int i=1;i<=lastRowNum ; i++) {
				  Row row = sheet.getRow(i); 
				  Cell cellname = row.getCell(1);
				  String name = cellname.getStringCellValue();
//				  System.out.println(name);
				  excelname.add(name);
//				  Cell cellprice = row.getCell(2);
//				  String price = cellprice.getStringCellValue();
//				  System.out.println(price);
//				  excelprice.add(price);
//				  cnt++;

			  } 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return excelname;
	}
	
	public ArrayList<String> Readprice() {
//		  String excelname[] = new String[7];
//		  String excelprice[] = new String[7];
	      ArrayList<String> excelprice = new ArrayList<String>();

		String Inpath = "D:\\swigy.xlsx";
		
		FileInputStream inputStream;
	
		try {
			inputStream = new FileInputStream(new File(Inpath));
		
			 Workbook workbook = WorkbookFactory.create(inputStream);
			  Sheet sheet = workbook.getSheet("Sheet1");
			  int lastRowNum = sheet.getLastRowNum();
//			  System.out.println(lastRowNum);
			
			  int cnt = 0 ;
			  for(int i=1;i<=lastRowNum ; i++) {
				  Row row = sheet.getRow(i); 
//				  Cell cellname = row.getCell(1);
//				  String name = cellname.getStringCellValue();
//				  System.out.println(name);
//				  excelname[cnt]= name;
				  Cell cellprice = row.getCell(2);
				  String price = cellprice.getStringCellValue();
//				  System.out.println(price);
				  excelprice.add(price);
//				  cnt++;

			  }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return excelprice;
	}
	
	public static void main(String[] args) {
		ReadExcel res = new ReadExcel();
		res.Readname();
		res.Readprice();
	}
}
