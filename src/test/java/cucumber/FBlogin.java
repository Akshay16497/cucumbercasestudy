package cucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Drviers.drivers;
import cucumber.api.java.en.*;

public class FBlogin {
	@Given("I have chosen to Login")
	public void i_have_chosen_to_Login() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		WebDriver akshay;
		akshay=drivers.getDriver("CHROME");
		akshay.get("https://en-gb.facebook.com/login/");
		akshay.findElement(By.name("email")).sendKeys("akshay");
		akshay.findElement(By.name("pass")).sendKeys("akkiyam");
	
		
		Thread.sleep(3000);
		akshay.close();
		
		
	    
	}

	@When("I have valid Username and Password")
	public void i_have_valid_Username_and_Password() {
		System.out.println("welcome to fb");

	  
	}
	@When("I have clicked on login button")
	public void i_have_clicked_on_login_button() {
	System.out.println("clicked on button");
	}

	@Then("I should be able to  access facebook")
	public void i_should_be_able_to_access_facebook() {
		System.out.println("now you can send friend request");
	  
	
	}

	@Then("I should see greeting message")
	public void i_should_see_greeting_message() {
		System.out.println("FR sent");
	  

	}
	

}
