package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	 //all the data memebers WebElement should declared globally and with private access specifier
	  //we use @find by annotation to find element in POM
			
		@FindBy (xpath = "//input[@id='user-name']") private WebElement userName;
		@FindBy (xpath = "//input[@id='password']") private WebElement password;
		@FindBy (xpath = "//input[@id='login-button']") private WebElement login;
		
		//constructors should be always public
		
		public SwagLabLoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this );
		}
		
		// the initelement method of page factory triggers @findby annotation and find the all webelement
		
		public void enterUserName(String name) {
	     userName.sendKeys(name);
		}
		
		public void enterPassword(String pass) {
			password.sendKeys(pass);
		}
	   
		public void clickOnLoginButton() {
			login.click();
		}
	}



