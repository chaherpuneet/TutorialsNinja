package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;

public class BillingDetails {
	
	public BillingDetails() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="(//i[contains(@class,'fa fa-caret-down')])[2]")
	public static WebElement billingDropdown;
	
	@FindBy(xpath="//input[contains(@value,'new')]")
	public static WebElement wantToUseNewAddress;
	
	@FindBy(css="input[name='firstname'][placeholder='First Name']")
	public static WebElement billingFirstName;
	
    @FindBy(css="input[name='lastname'][placeholder='Last Name']")
	public static WebElement billingLastName;
    
    @FindBy(css="input[name='company'][placeholder='Company']")
    public static WebElement billingCompanyName;
    
    @FindBy(css="input[name='address_1'][placeholder='Address 1']")
    public static WebElement billingAddress1;
    
    @FindBy(css="input[name='city'][placeholder='City']")
    public static WebElement billingCity;
    
    @FindBy(css="input[name='postcode'][placeholder='Post Code']")
    public static WebElement billingPinCode;
    
    @FindBy(id="input-payment-country")
    public static WebElement billingCountry;
    
    @FindBy(id="input-payment-zone")
    public static WebElement billingRegion;
    
    @FindBy(id="button-payment-address")
    public static WebElement billingContinueButton;
    
    public static void enterBillingDetails() {
    	
    	Elements.click(billingDropdown);
    	Waits.setImplicitWait(3000);
    	Elements.selectRadioButton(wantToUseNewAddress);
    	Waits.setImplicitWait(2000);
    	Elements.TypeText(billingFirstName, Base.reader.getFName());
    	Elements.TypeText(billingLastName, Base.reader.getLName());
    	Elements.TypeText(billingCompanyName, Base.reader.getCompany());
    	Elements.TypeText(billingAddress1, Base.reader.getAddress());
    	Elements.scrollToElemet(billingRegion);
    	Elements.TypeText(billingCity, Base.reader.getCity());
    	Elements.TypeText(billingPinCode, Base.reader.getPinCode());
    	Elements.selectByText(billingCountry, Base.reader.getCountry());
    	Waits.setImplicitWait(3000);
    	Elements.selectByText(billingRegion, Base.reader.getRegion());;
    	Elements.click(billingContinueButton);
    }
}
    
    