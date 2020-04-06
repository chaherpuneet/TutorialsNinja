package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;


public class Login {
	
	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
	
	@And("^I navigate to account login page$")
	public void i_navigate_to_account_login_page()  {
		
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.login);
	    
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void I_enter_username_and_password(String email, String password)  {
		
		LoginPage.doLogin(email, password);
	}

	@Then("^I should see user is able to login successfully$")
	public void i_should_see_user_is_able_to_login_successfully() {
		
		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffliateAccount));
	    
	}
	
	@Then("^I should see an error message that the credentials are invalid$")
	public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "Warning: No match for E-Mail Address and/or Password."));
		
	  }
	
	@When("^I reset the password for email \"([^\"]*)\"$")
	public void i_reset_the_password_for_email(String email) {
		
		Elements.click(LoginPage.forgotPassword);
		Elements.TypeText(ForgotPasswordPage.emailField, email);
		Elements.click(ForgotPasswordPage.continueButton);
	   
	}

	@Then("^I should see a confirmation alert for sending mail for resetting password$")
	public void i_should_see_a_confirmation_alert_for_sending_mail_for_resetting_password(){
		
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning, "An email with a confirmation link has been sent your email address."));
	    
	}

	
	


}
