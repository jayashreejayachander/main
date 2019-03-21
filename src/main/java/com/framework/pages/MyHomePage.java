package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads") WebElement eleClickLeads;
	public myLeads clickLeads() {
		
		click(eleClickLeads);
		return new myLeads(); 
	}

	
}
