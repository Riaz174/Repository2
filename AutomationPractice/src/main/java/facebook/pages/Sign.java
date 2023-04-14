package facebook.pages;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(xpath = "//*[text()='Create new account']")WebElement creatnewacc;
	@FindBy(name = "firstname")WebElement fname;
	@FindBy(name = "lastname")WebElement sname;
	
	public Sign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	public void createNewAccountClick() {
		creatnewacc.click();
		
	}
	
	public void fNameClick() {
		fname.click();
	}
	public void sNameClick() {
		sname.click();
		
	}
	
	
		
		
	}
	
	

