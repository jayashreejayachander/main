package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		//apply PageFactory
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how = How.ID,using="username") WebElement eleUsername;
	@FindBy(how = How.ID,using="password") WebElement elePassword;
	@FindBy(how = How.CLASS_NAME,using="decorativeSubmit") WebElement eleLogin;
	
	public LoginPage enterUsername(String username) {
		//WebElement eleUsername = locateElement("id", "username");
		clearAndType(eleUsername, username);
		return this; 
	}
	public LoginPage enterPassword(String password)  {
		//WebElement elePassword = locateElement("id", "password");
		clearAndType(elePassword,password);
		
		return this;
	}
	public HomePage clickLogin() throws InterruptedException {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
		Thread.sleep(3000);
	    click(eleLogin);
	    /*HomePage hp = new HomePage();
	    return hp;*/ 
	    return new HomePage();
	}
}













