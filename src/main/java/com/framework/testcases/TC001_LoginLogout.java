package com.framework.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.design.ProjectMethods;
import com.framework.pages.LoginPage;
import com.framework.pages.createLeads;

public class TC001_LoginLogout extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName = "TC001_LoginLogout";
		testDescription = "Login into leaftaps";
		testNodes = "Leads";
		author = "Gayatri";
		category = "smoke";
		dataSheetName = "TC001";	
		
	}
	
	@Test(dataProvider="fetchData")
	public void Login(String username, String password) throws InterruptedException {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads();
	
	}	
	}

	