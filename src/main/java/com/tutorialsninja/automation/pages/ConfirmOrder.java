package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class ConfirmOrder {
	
	public ConfirmOrder() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderButton;
	
	@FindBy(linkText = "Success")
	public static WebElement confirmOrderStatus;
	
	public static void clickConfirmButton() {
		
		Elements.click(confirmOrderButton);
	}

}
