package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		//Link text means text is available in this link. It starts with <a href and will contain text in it.
		//WebElement bestsellers = driver.findElement(By.linkText("Best Sellers"));
		//bestsellers.click();
		Thread.sleep(6000);
		WebElement todaysdeals = driver.findElement(By.linkText("Today's Deals"));
		todaysdeals.click();
		Thread.sleep(6000);
		WebElement customerservices = driver.findElement(By.linkText("Customer Service"));
		customerservices.click();
		Thread.sleep(3000);
		WebElement registery = driver.findElement(By.linkText("Registry"));
		registery.click();
		Thread.sleep(3000);
		WebElement giftcard = driver.findElement(By.linkText("Gift Cards"));
		giftcard.click();
		Thread.sleep(3000);
		WebElement sell = driver.findElement(By.linkText("Sell"));
		sell.click();
		Thread.sleep(3000);
		//WebElement account = driver.findElement(By.partialLinkText("Account"));
		//account.click();//partial link text is a part of text from start to locate an element.
		Thread.sleep(3000);
		WebElement fields = driver.findElement(By.name("field-keywords"));
		fields.sendKeys("Computer");
		
		

	}

}
