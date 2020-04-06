package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	HeaderSection headerSection = new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to account registration page$")
	public void i_navigate_to_account_registration_page() {
		
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.register);
	  
	}

	@When("^I provide all the required details$")
	public void i_provide_all_the_required_details(DataTable dataTable)  {
		
		RegisterPage.enterAllDetails(dataTable, "unique");
	
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
		
		Elements.click(RegisterPage.privacy);
	 
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button() {
		
		Elements.click(RegisterPage.continueButton);
	  
	}

	@Then("^I should see that the user account has been created successfully$")
	public void i_should_see_that_the_user_account_has_been_created_successfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadCrum));
		
	 
	}
	
	@Then("^I should see that user account is not created$")
	public void i_should_see_that_user_account_is_not_created()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrum));
	 
	}

	@Then("^I should see the error message informing user to fill mandatory fields$")
	public void i_should_see_the_error_message_informing_user_to_fill_mandatory_fields()  {
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.inputPasswordWarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));
	
	}
	
	@And("^I subscribe to the newsletter$")
	public void i_subscribe_to_the_newsletter() {
		
		Elements.click(RegisterPage.yesToNewsletter);
	    
	}
	
	@When("^I provide the below duplicate details\\.$")
	public void i_provide_the_below_duplicate_details(DataTable dataTable)  {
		
		RegisterPage.enterAllDetails(dataTable, "duplicate");
		
	    
	}

	@Then("^i should see that the user is restricted from creating duplicate account$")
	public void i_should_see_that_the_user_is_restricted_from_creating_duplicate_account()  {
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning, "Warning: E-Mail Address is already registered!"));
	  
	}



}
