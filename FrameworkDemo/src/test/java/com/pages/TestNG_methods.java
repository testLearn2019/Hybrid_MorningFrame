package com.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_methods {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforemeth() {
		System.out.println("Before method");
	}
	
	@Test (priority=3)
	public void test1() {
		System.out.println("===test 1===");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("===test 2===");
	}
	@Test(priority=4)
	public void test3() {
		System.out.println("===test 3===");
	}
	@Test(priority =2)
	public void test4() {
		System.out.println("===test 4===");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
