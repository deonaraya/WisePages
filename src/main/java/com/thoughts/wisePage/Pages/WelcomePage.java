package com.thoughts.wisePage.Pages;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WelcomePage {
	
	WebDriver driver ;
	
	public WelcomePage(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="search_query_top")
	private WebElement searchTextField ;
	
	@FindBy(xpath="//div[@class='header_user_info']/a")
	private WebElement signInLink ;
	
	
	public void searchSel() {
	//	searchTextField.sendKeys("Tunics");
		System.out.println("chandra" + searchTextField);
	}
	
	
	
	
	public void signIn(){
		signInLink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
