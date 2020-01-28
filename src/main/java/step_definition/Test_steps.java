package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page()
	{
		System.out.println("User is on Home Page");
	   
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() 
	{
	   System.out.println("User Navigate to LogIn Page");
	}

	@When("User enters userName and Password")
	public void user_enters_userName_and_Password() 
	{
		System.out.println("User enters userName and Password");
	}

	@Then("Mesage displayed Login Succesfully")
	public void mesage_displayed_Login_Succesfully() 
	{
		System.out.println("Mesage displayed Login Succesfully");
	    
	}
//
//	@When("User Logout from the Application")
//	public void user_Logout_from_the_Application() 
//	{ 
//		System.out.println("User Logout from the Application");
//	} 
//
//	@Then("Message displayed Logout Successfully")
//	public void message_displayed_Logout_Successfully()
//	{
//		System.out.println("Message displayed Logout Successfully");
//	}

}