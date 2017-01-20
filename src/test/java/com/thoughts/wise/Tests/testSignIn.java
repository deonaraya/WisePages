package com.thoughts.wise.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughts.wisePage.Pages.WelcomePage;

public class testSignIn {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		driver = new FirefoxDriver() ;
		driver.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void dosignIn(){
		WelcomePage objWelcome = new WelcomePage(driver);
		objWelcome.signIn();
	}
	
	@AfterClass
	public void teatDown(){
		driver.close();
	}

}
