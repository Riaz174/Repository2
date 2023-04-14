package Common;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Utilities {
	public  WebDriver driver;
	@Parameters({"browser","wbsite"})

 @BeforeMethod
	  public void Browsers(String browsers, String wbsite) {
		  if(browsers.equalsIgnoreCase("Chrome")) {
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.navigate().to("http://www.facebook.com");
				driver.manage().window().maximize();
		  }else if(browsers.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.navigate().to("http://www.facebook.com");
				driver.manage().window().maximize();
		  }else {
			  System.out.println("Correct browsers name");
		  }
	  }
	  
  

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	 // driver.quit();
  }
  public void shots() throws IOException {
	  Date is = new Date();
	  String sd=is.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(sd);
	  System.out.println(is);
	  File ks= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\Pictures\\"+sd+"pictureofwebsite.jpg"));
	  
	  
  
	  
  }
  }


