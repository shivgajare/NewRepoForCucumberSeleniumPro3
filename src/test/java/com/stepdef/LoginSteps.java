package com.stepdef;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;


public class LoginSteps {
	
	WebDriver driver;
	

	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {

		driver.manage().window().maximize();
		driver.findElement( By.xpath("//span[contains(@class,'caret')]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, 'https://tutorialsninja.com/demo/index.php?route=account/login')]")).click();
		//Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@id='input-email']")).sendKeys(string);
		//Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@id= 'input-password']")).sendKeys(string2);
		//Thread.sleep(5000);
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class=\"user-icon\"]")).click();
		driver.findElement(By.xpath("//a[contains(@title, 'Login with Email')]")).click();*/
		
		
	   
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		driver.findElement( By.xpath("//input[@type= 'submit']")).click();
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		Assert.assertTrue(driver.getTitle().contains("My Account"));
		
	  
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.manage().window().maximize();
		driver.findElement( By.xpath("//span[contains(@class,'caret')]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, 'https://tutorialsninja.com/demo/index.php?route=account/login')]")).click();
		//Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@id='input-email']")).sendKeys(string);
		//Thread.sleep(5000);
		driver.findElement( By.xpath("//input[@id= 'input-password']")).sendKeys(string2);
	}
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement( By.xpath("//input[@type= 'submit']")).click();
	  
	}
	@Then("user is on same page login unsuccessful")
	public void user_is_on_same_page_login_unsuccessful() {
		

	}



}
