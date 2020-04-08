package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.BillingDetails;
import com.tutorialsninja.automation.pages.ConfirmOrder;
import com.tutorialsninja.automation.pages.DeliveryDetails;
import com.tutorialsninja.automation.pages.DeliveryMethod;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.PaymentMethod;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCart;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Checkout  {
	
	LoginPage loginPage = new LoginPage();
	HeaderSection headerSection = new HeaderSection();
	SearchResultPage searchResultPage = new SearchResultPage();
	ShoppingCart shoppingCart = new ShoppingCart();
	BillingDetails billingDetails = new BillingDetails();
	DeliveryDetails deliveryDetails = new DeliveryDetails();
	DeliveryMethod deliveryMethod = new DeliveryMethod();
	PaymentMethod paymentMethod = new PaymentMethod();
	ConfirmOrder confirmOrder = new ConfirmOrder();
	
	@Given("^I login into the application$")
	public void i_login_into_the_application()  {
		
		Browser.openApplicationURL();
		HeaderSection.navigateToLoginPage();
		LoginPage.doLogin();
	   }

	@When("^I add a product to cart and checkout$")
	public void i_add_a_product_to_cart_and_checkout()  {
		
		HeaderSection.searchProduct();
		SearchResultPage.addFirstSearchProductIntoCart();
		HeaderSection.navigateToShoppingCart();
		ShoppingCart.clickOnCheckOutButton();
	    
	}

	@And("^I place an order$")
	public void i_place_an_order()  {
		
		BillingDetails.enterBillingDetails();
		DeliveryDetails.clickShippingContinueButton();
		DeliveryMethod.clickDeliveryMethodButton();
		PaymentMethod.clickPaymentMethodButton();
		ConfirmOrder.clickConfirmButton();
		
			    
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Assert.assertTrue(Elements.isDisplayed(ConfirmOrder.confirmOrderStatus));
	   
	}


}
