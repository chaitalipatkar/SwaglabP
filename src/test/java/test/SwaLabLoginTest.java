package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SwagLabHomePage;
import pom.SwagLabLoginPage;



public class SwaLabLoginTest {
	
   WebDriver driver;
		
		@BeforeMethod
	    public void openSwagLab() {
			 driver.get("https://www.saucedemo.com/");
		}
		
		@Test
		
		public void loginWithValidUser () {
			SwagLabLoginPage  SwagLabLoginPage = new SwagLabLoginPage (driver);
			SwagLabLoginPage.enterUserName("standard_user"); 
			SwagLabLoginPage.enterPassword("secret_sauce");
			SwagLabLoginPage.clickOnLoginButton(); 
			SwagLabHomePage swagLabHomePage = new SwagLabHomePage(driver);
			swagLabHomePage.clickOnMenu();
			Assert.assertTrue(swagLabHomePage.isLogoutDisplayed());
			
			System.out.println("hello");
		}
		@Test
		public void loginWithLockedOutUser() {
			
			    WebDriver driver = new ChromeDriver();
			    driver.get("https://www.saucedemo.com/");    // in testing does not written always browser launch code
				SwagLabLoginPage  SwagLabLoginPage = new SwagLabLoginPage (driver);
				SwagLabLoginPage.enterUserName("locked_out_user"); 
				SwagLabLoginPage.enterPassword("secret_sauce");
				SwagLabLoginPage.clickOnLoginButton(); 
				SwagLabHomePage swagLabHomePage = new  SwagLabHomePage(driver);
				Assert.assertTrue(swagLabHomePage.isHomePageTitleDisplayed());
				
			}	
		@Test
		public void loginWithProblemUser() {
			//  WebDriver driver = new ChromeDriver();
			  //  driver.get("https://www.saucedemo.com/");
				SwagLabLoginPage  SwagLabLoginPage = new SwagLabLoginPage (driver);
				SwagLabLoginPage.enterUserName("problem_user"); 
				SwagLabLoginPage.enterPassword("secret_sauce");
				SwagLabLoginPage.clickOnLoginButton(); 
		}
		@Test
		public void loginWithPerformanceGlitchUser() {
			// WebDriver driver = new ChromeDriver();
			 //   driver.get("https://www.saucedemo.com/");
				SwagLabLoginPage  SwagLabLoginPage = new SwagLabLoginPage (driver);
				SwagLabLoginPage.enterUserName("performance_glitch_user"); 
				SwagLabLoginPage.enterPassword("secret_sauce");
				SwagLabLoginPage.clickOnLoginButton(); 
		}	
		@AfterMethod
		public void closeBrowser() {
			//driver.close();
		}
		
				
		}
				
	
	
	
	
	
	
	
	
	
	
	


