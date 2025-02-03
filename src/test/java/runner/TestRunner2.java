package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
plugin = {"pretty", "html:target/result.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		 monochrome=false,  
		 tags = "@Login2", 
		 features = {"src/test/resources/features"}, 
	        glue= "stepdefinition") 


public class TestRunner2 extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
}