package com.excel;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Listener implements ITestListener{
//	Time time = new Time();
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ " test passed");
		test.log(Status.PASS,result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" test failled");
		test.log(Status.FAIL,result.getName());
	}
	ExtentReports extent;
	@Override
	public void onStart(ITestContext context) {
//		String time = printTime.getCurrentTime();
		String ptReport = System.getProperty("user.dir")+"\\report\\";
//	    String rName = "Execution"+time+".html";
		String rName = "Execution1.html";
	    String fname = ptReport+rName;
	    System.out.println(fname);
	    ExtentHtmlReporter html= new ExtentHtmlReporter(fname);
	    extent=new ExtentReports();
	    extent.attachReporter(html);
	}
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult context) {
		System.out.println(context.getName()+"Starting");
		test= extent.createTest(context.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+" finished");
		extent.flush();
	}
}
