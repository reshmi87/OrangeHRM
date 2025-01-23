package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMLeave {
	
	WebDriver driver;
	@Given("user is login to Orange HRM application with {string} and {string}")
	public void user_is_login_to_orange_hrm_application_with_and(String username, String password) {
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();   
		System.out.println("Reached the home page");
		driver.close();
	   
	}

	@When("user navigates to Leave meanu in Orange HRM application")
	public void user_navigates_to_leave_meanu_in_orange_hrm_application() {
	    
	   
	}

	@When("user clicks apply link in leave screen of Orange HRM application")
	public void user_clicks_apply_link_in_leave_screen_of_orange_hrm_application() {
	    
	   
	}

	@Then("user should able to view Apply Leave screen in Orange HRM application")
	public void user_should_able_to_view_apply_leave_screen_in_orange_hrm_application() {
	    
	   
	}

}
