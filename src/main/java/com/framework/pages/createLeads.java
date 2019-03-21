package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class createLeads extends ProjectMethods {
	
	public createLeads() {
		PageFactory.initElements(driver, this);
	}
			
	@FindBy(how=How.ID,using="createLeadForm_companyName") WebElement eleCompanyName;
	public createLeads enterCompanyName(String companyName) {
		
		clearAndType(eleCompanyName, companyName);
		return this; 
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName") WebElement eleFirstName;
	public createLeads enterFirstName(String firstName) {
		
		clearAndType(eleFirstName, firstName);
		return this; 
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName") WebElement eleLastName;
	public createLeads enterLastName(String lastName) {
		
		clearAndType(eleLastName, lastName);
		return this; 
	}
	
	@FindBy(how=How.NAME,using="submitButton") WebElement eleCreateButton;
	public viewLead clickCreateButton() {
		
		click(eleCreateButton);
		return new viewLead(); 
	}
	
	
	
	
	
	
	
}
