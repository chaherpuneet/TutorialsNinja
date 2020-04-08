package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class DeliveryDetails {
	
	public DeliveryDetails() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-shipping-address")
	public static WebElement shippingContinueButton;
	
	
	public static void clickShippingContinueButton() {
		
		Elements.click(shippingContinueButton);
	}

}
