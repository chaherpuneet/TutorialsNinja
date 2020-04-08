package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class DeliveryMethod {
	
	public DeliveryMethod() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-shipping-method")
	public static WebElement deliveryButtonContinue;
	
	
	public static void clickDeliveryMethodButton() {
		
		Elements.click(deliveryButtonContinue);
	}

}
