package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SwagLabLoginPage;



public class SwagLabCartTest {

		public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\updated chromedriver\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		    driver.get("https://www.saucedemo.com/");
	
		    SwagLabLoginPage  SwagLabLoginPage = new SwagLabLoginPage (driver);
			SwagLabLoginPage.enterUserName("standard_user"); 
			SwagLabLoginPage.enterPassword("secret_sauce");
			SwagLabLoginPage.clickOnLoginButton(); 
		    
		    WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
			addToCart.click();
		}   
	}


