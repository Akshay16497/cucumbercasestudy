package stepdefinations;

import org.openqa.selenium.WebDriver;

import Drviers.drivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Background {
	

@Given("Launch Url")
public void launch_Url() {
	System.out.println("chrome launched");
	
   
}

@Given("Demoweb shop url launched")
public void demoweb_shop_url_launched() {
	System.out.println("demowebshop launched");
	
}

@Then("clock on login")
public void clock_on_login() {
	System.out.println("login");
  
}

@Then("provided credentials")
public void provided_credentials() {
	System.out.println("provide credential");
  
}

@Then("user should see home page")
public void user_should_see_home_page() {
	System.out.println("see home page");
   
}

@Then("click on register")
public void click_on_register() {
	System.out.println("click on register");
    
}

@Then("provide all credentials")
public void provide_all_credentials() {
	System.out.println("provide all details");
   
}

@Then("he should be registered user")
public void he_should_be_registered_user() {
	System.out.println("register user");
  
}

}
