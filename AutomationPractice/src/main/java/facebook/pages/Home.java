package facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(id ="email") WebElement email;
	@FindBy(name = "pass") WebElement password;
	@FindBy(name = "login")WebElement login;
	@FindBy(xpath = "//*[text()='Forgotten password?']")WebElement fpassword;
	@FindBy(xpath = "//*[text()='You must log in to continue.']") WebElement text;
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void Username() {
		email.sendKeys("abc@gmail.com");
	}
	public void PasswordClick() {
		password.sendKeys("abcde");
		
	}
	public void loginClick() {
		login.click();
	}
	public void ForgottonPasswordClick() {
		fpassword.click();
	}

}
