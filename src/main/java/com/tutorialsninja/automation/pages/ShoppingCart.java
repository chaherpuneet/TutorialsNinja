package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class ShoppingCart {
	
	public ShoppingCart() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(linkText = "Checkout")
	public static WebElement checkoutButton;
	
	public static void clickOnCheckOutButton() {
		
		Elements.click(checkoutButton);
		Waits.setImplicitWait(10000);
	}
	

}
