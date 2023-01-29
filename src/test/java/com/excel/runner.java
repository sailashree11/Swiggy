package com.excel;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)
public class runner {
	public WebDriver driver;
  @Test
  public void main() {
	  main main = new main();
	  enterexcel EEx = new enterexcel();
	  ReadExcel REx = new ReadExcel();
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   main.home(driver);
	   main.loc(driver);
	   main.search(driver);
	   ArrayList<String> itemlist = main.item(driver);
	   ArrayList<String> pricelist = main.price(driver);
//	   main.addtocart(driver);
//	   main.update(driver);
	   EEx.EnterExcel(itemlist, pricelist);
	   ArrayList<String> namex = REx.Readname();
	   ArrayList<String> pricex = REx.Readprice();
	   System.out.println("Reading from excel");
	   for (int indx = 1; indx <= 10; indx++) {
		   System.out.println("value from Excel"+ "   "+ "value from web");
		   System.out.println(namex.get(indx-1)+ "   "+ itemlist.get(indx-1));
		   System.out.println(pricex.get(indx-1)+ "   "+ pricelist.get(indx-1));
		   
	   }
	   
  }
}
