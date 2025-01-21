package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(
plugin = {"pretty", "html:target/result1.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		 monochrome=false,  
		 tags = "@Sanity", 
		 features = {"src/test/resources/features"}, 
	        glue= "stepdefinition") 


public class TestRunner {
	

}
