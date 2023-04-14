package facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeText {
	public static WebDriver driver;
	@FindBy(xpath = "//*[text()='Facebook helps you connect and share with the people in your life.']") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name ="pass") WebElement password;
	@FindBy(name = "login") WebElement button;
	public HomeText(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public String verificationOfText() {
		String tx = text.getText();
		return tx;
	}
	public void Username() {
		email.sendKeys("john@gmail.com");
	}
	public void password() {
		password.sendKeys("education");
	}
	public void login() {
		button.click();
	}
}
