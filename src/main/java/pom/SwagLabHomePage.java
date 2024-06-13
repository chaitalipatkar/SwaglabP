package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabHomePage {
	
	@FindBy (xpath ="//span[text()='Products']") private WebElement title;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logout;
	
	public SwagLabHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public boolean isHomePageTitleDisplayed() {
		return title.isDisplayed();
	}
	public void clickOnMenu() {
		menu.click();
	}
	public  boolean isLogoutDisplayed() {
		return logout.isDisplayed();
		
	}
	
	

}
