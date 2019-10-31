package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy2 {
	WebDriver akshay;
	@Given("User is on HomePage")
	public void user_is_on_HomePage() {
		System.setProperty("webdriver.chrome.driver","C:\\MY Drivers\\chromedriver.exe");
		akshay=new ChromeDriver();
		  akshay.get("http://demowebshop.tricentis.com/");
		  akshay.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("User fills valid credential {string}, {string}")
	public void user_fills_valid_credential(String string, String string2) throws InterruptedException {
	//	Thread.sleep(2000);
	//	 akshay.findElement(By.xpath("//a[text()='Log in']")).click();
		 akshay.findElement(By.name("Email")).sendKeys(string);
		   akshay.findElement(By.name("Password")).sendKeys(string2);
		 //input[@value="Log in"]
		   akshay.findElement(By.xpath(" //input[@value=\"Log in\"]")).click();
	}

	@Then("user should be able to Login")
	public void user_should_be_able_to_Login() {
		System.out.println("Login successful");
		akshay.close();
	   
	}

}
