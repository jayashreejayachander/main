package com.framework.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.design.ProjectMethods;
import com.framework.pages.LoginPage;
import com.framework.pages.createLeads;

public class TC002_CreateLead extends ProjectMethods{
			
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription = "Login into leaftaps";
		testNodes = "Leads";
		author = "Jayashree";
		category = "smoke";
		dataSheetName = "TC002";
		
	}
	
	@Test(dataProvider="fetchData")
	public void createLeads(String username,String password,String compname, String fname, String lname) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName(compname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateButton();
			
}
	
}
