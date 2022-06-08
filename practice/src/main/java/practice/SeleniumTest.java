package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
public static void main(String[] args) {  
        
		//File file = new File("src/test/resources/chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());/
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	// Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    //driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
	          
	    // Click on the search button  
	   // driver.findElement(By.name("btnK")).click();  
	      
	    }  
}
