package com.tutorialsninja.automation.config;


import java.io.IOException;
import java.util.Properties;

import com.tutorialsninja.automation.util.PathHelper;



public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	
	public String getUsername() {
		
		return properties.getProperty("username");
		
	}

	
	public String getPassword() {
		
		return properties.getProperty("password");
		
	}

	
	public String getProduct() {
		return properties.getProperty("product");
	}

	public String getFName() {
		
		return properties.getProperty("FName");
	}

	
	public String getLName() {
		
		return properties.getProperty("LName");
	}

		public String getCompany() {
		
		return properties.getProperty("Company");
	}

		public String getAddress() {
		
		return properties.getProperty("Address");
	}

		public String getCity() {
		
		return properties.getProperty("City");
	}

	    public String getPinCode() {
		
		return properties.getProperty("Pincode");
	}

	public String getCountry() {
		
		return properties.getProperty("Country");
	}

	
	public String getRegion() {
		
		return properties.getProperty("Region");
	}
	
	

	
	}
