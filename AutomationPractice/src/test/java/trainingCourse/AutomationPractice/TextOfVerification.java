package trainingCourse.AutomationPractice;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import Common.Utilities;
import facebook.pages.Home;
import facebook.pages.HomeOfFacebook;
import facebook.pages.HomeText;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TextOfVerification extends Utilities{

	
  @Test(priority = 2)
  public void f() throws IOException, InterruptedException {
	  HomeOfFacebook home= new HomeOfFacebook(driver);
	  String tx = home.verificationOfText();
	  shots();
	  System.out.println(tx);
	//  Assert.assertEquals(tx,"Facebook helps you connect and share with the people in your life.");
	  SoftAssert st = new SoftAssert();
	  Thread.sleep(3000);
	  shots();
	  st.assertEquals(tx, "Facebook helps you connect and share with the people in your life.");
	  System.out.println("This is after assertion");
	  Thread.sleep(3000);
	  shots();
	  st.assertAll();
	  st.assertAll();
	  File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\Pictures\\pictureofwebsite.jpg"));
	  
  }
//  @AfterMethod
//  public void afterMethod() throws InterruptedException {
//	  Thread.sleep(3000);
//  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  Browsers("Chrome");
//	  Browsers("Edge");
//	  System.setProperty("webdriver.chrome.driver", "\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
//	driver= new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\msedgedriver.exe");
//		driver = new EdgeDriver();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.manage().window().maximize();
//  }
//  
//
//  
  @Test(priority = 1)
  public void signin(String n, String s) throws  InterruptedException {
	  HomeOfFacebook home= new HomeOfFacebook(driver);
	  home.Username();
	  home.Password();
	  home.login();
  }
}
  

//  public void Browsers(String browsers) {
//	  if(browsers.equalsIgnoreCase("Chrome")) {
//		   System.setProperty("webdriver.chrome.driver", "\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
//				driver= new ChromeDriver();
//	  }else if(browsers.equalsIgnoreCase("Edge")) {
//		  System.setProperty("webdriver.edge.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//	  }else {
//		  System.out.println("Correct browsers name");
//		  
//		  
//	  }
//  }
//  public void shots() throws IOException {
//	  Date is= new Date();
//	  System.out.println(is);
//	 String sd = is.toString().replace(" ", "_").replace(":", "_");
//	 System.out.println(sd);
//	  File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  FileHandler.copy(ks, new File("C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\Pictures\\"+sd+"pictureofwebsite.jpg1"));
//	  
//  }
//  }
  
	 	  
  
	



