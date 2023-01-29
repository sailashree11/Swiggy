package com.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ="Features",
glue = {"steps"}
)
public class RunTest extends AbstractTestNGCucumberTests {

}
