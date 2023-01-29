package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class enterexcel {
public void EnterExcel(ArrayList<String> name , ArrayList<String> price)  {
		
//		System.out.println(a);
		String path ="D:\\login.xlsx";
		String outputpath="D:\\swigy.xlsx";
		try {
			FileOutputStream fileoutputstream= new FileOutputStream(new File(outputpath));
			FileInputStream inputStream = new FileInputStream(new File(path));
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
//			int lastRowNum = sheet.getLastRowNum();
			int rang= name.size();
//			System.out.println(rang);
			for (int indx = 1; indx <= rang; indx++) {
		                Row row = sheet.getRow(indx);
		                Cell cellName = row.createCell(1);
		                if (cellName == null) {
		                	row = sheet.createRow(1); 
		                }
						Cell cellPrice = row.createCell(2);
//		                String val = "admin"+" "+(indx-1);
//		                System.out.println(val);
		                cellName.setCellValue(name.get(indx-1));
		                cellPrice.setCellValue(price.get(indx-1));
//		                cellActUN.setCellValue("admin");

//		                Create a cell
//		                Cell cellUN = row.getCell(1,MissingCellPolicy.CREATE_NULL_AS_BLANK);
//		                String strUN = cellUN.getStringCellValue();
//		                System.out.println(strUN);
			}
			
			workbook.write(fileoutputstream);
			workbook.close();
			fileoutputstream.close();
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
}
}
			
		

	
