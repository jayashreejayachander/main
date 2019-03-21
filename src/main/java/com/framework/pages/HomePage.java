package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
       PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA") WebElement eleClickCRMSFA;
	public MyHomePage clickCRMSFA() {
		
		click(eleClickCRMSFA);
		return new MyHomePage(); 
	}

	@FindBy(how = How.CLASS_NAME,using="decorativeSubmit") WebElement eleLogout;
	public LoginPage clickLogout() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(eleLogout);
		return new LoginPage(); 
	}


}
















