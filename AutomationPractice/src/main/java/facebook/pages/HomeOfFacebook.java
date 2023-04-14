package facebook.pages;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Facebook helps you connect and share with the people in your life.')]") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement password;
	@FindBy(name = "login") WebElement login;
	public HomeOfFacebook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String verificationOfText() {
		String tx = text.getText();
		return tx;

	}
	public void Username() {
		email.sendKeys();
	}
	public void Password() {
		password.sendKeys();
		
	}
	
	public void login() {
		login.click();
	}
	public void Username(String n) {
		// TODO Auto-generated method stub
		
	}
	public void Password(String s) {
		// TODO Auto-generated method stub
		
	}
	
	}

	
	
	
		
	


	
	





