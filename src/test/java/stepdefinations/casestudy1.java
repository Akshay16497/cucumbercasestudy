package stepdefinations;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class casestudy1 {
	WebDriver akshay;

@Given("User is on home page")
public void user_is_on_home_page() {
	
	System.setProperty("webdriver.chrome.driver","C:\\MY Drivers\\chromedriver.exe");
	akshay=new ChromeDriver();
	  akshay.get("http://demowebshop.tricentis.com/");
	
    
}

@Given("user choose to Register")
public void user_choose_to_Register() {
	  akshay.findElement(By.xpath("//a[text()='Register']")).click();
    
}

@When("user selects {string}")
public void user_selects(String gender) {
	System.out.println(gender);
	if(gender.equals("M"))
	{
		  akshay.findElement(By.xpath("//input[@value='M']")).click();
	}
	if(gender.equals("F"))
	{
		  akshay.findElement(By.xpath("//input[@value='F']")).click();
	}
   
}

@When("user enters {string},{string},{string},{string}")
public void user_enters(String a, String b, String c, String d) {
	 akshay.findElement(By.name("FirstName")).sendKeys(a);
	  akshay.findElement(By.name("LastName")).sendKeys(b);
	   akshay.findElement(By.name("Email")).sendKeys(c);
	   akshay.findElement(By.name("Password")).sendKeys(d);
	   akshay.findElement(By.name("ConfirmPassword")).sendKeys(d);
    
}

@When("user clicks on Register")
public void user_clicks_on_Register() throws InterruptedException {
	  akshay.findElement(By.name("register-button")).click();
		Thread.sleep(5000);
	  
}

@Then("user Registration will be successful")
public void user_Registration_will_be_successful() throws InterruptedException  {
	
	String title1=akshay.getCurrentUrl();
	Thread.sleep(5000);
//	akshay.close();
	Assert.assertEquals(title1,"http://demowebshop.tricentis.com/registerresult/1");
	System.out.println("login success");
	akshay.close();
   
}
}
