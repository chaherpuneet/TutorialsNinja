package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class PaymentMethod {
	
	public PaymentMethod() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-method")
	public static WebElement paymentButton;
	
	@FindBy(css = "input[type='checkbox'][name='agree']")
	public static WebElement agreeCheckbox;
	
	
	public static void clickPaymentMethodButton() {
		
		Elements.selectCheckBox(agreeCheckbox);
		Elements.click(paymentButton);
		
	}

}
