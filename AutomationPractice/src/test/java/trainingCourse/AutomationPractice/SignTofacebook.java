package trainingCourse.AutomationPractice;

import org.testng.annotations.Test;


import Common.Utilities;

import facebook.pages.HomeOfFacebook;
import facebook.pages.Sign;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignTofacebook extends Utilities{
	
  @Test
  public void f() throws InterruptedException {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.Username();
	  home.Password();
	  home.login();
	  
	  Sign sign = new Sign(driver);
	  sign.createNewAccountClick();
	  sign.fNameClick();
	  sign.sNameClick();
	  
 
	  
	 
	 }
  

  

}
