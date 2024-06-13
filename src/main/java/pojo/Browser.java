package pojo;


 
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;



	       public class Browser {
	       	
	   	 public static WebDriver launchBrowser (String  url) {
	   		 
	       System.setProperty("webdriver.chrome.driver","F:\\Software Testing\\updated chromedriver\\chromedriver-win64\\chromedriver.exe");
	       
	        WebDriver driver =new ChromeDriver(); 
	        
	       driver.get("url");
	       
	   	driver.manage().window().maximize();
	   	
	   //	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	   	
	   	//this wait will be applicable for all the elements and max duration for wait is 5 sec
	   	
	   	return driver;
	       
	       
	       
	   	 }
	       }
	
	
	
	
	
	
	
	
	


