package com.testcases;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.UserManagement_Admin;

public class VerifyOrangeHRM extends BaseClass{

	@Test (priority=1)
	public void verifyUserManagementPage() throws Exception {
	LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	UserManagement_Admin user = new UserManagement_Admin(driver);
	
	login.login();
	/*Thread.sleep(2000);
	home.admin();
	Thread.sleep(2500);
	user.search();
	user.addUser();*/
	
	}

}
