package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main ( String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\updated chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	    File destination = new File("C:\\Users\\SWAPNIL\\Documents\\screenshot\\facebook.jpeg");
	    
	   FileHandler.copy(source,destination);
	}
}













