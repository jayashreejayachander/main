package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class myLeads extends ProjectMethods {
		
		public myLeads() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.LINK_TEXT,using="Create Lead") WebElement eleClickCreateLeads;
		public createLeads clickCreateLeads() {
			
			click(eleClickCreateLeads);
			return new createLeads(); 
		}
		
}
