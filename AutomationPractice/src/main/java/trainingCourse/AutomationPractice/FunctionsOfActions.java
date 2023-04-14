package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionsOfActions {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);//Create object for actions class
		action.moveToElement(sign).build().perform();
		Thread.sleep(3000);
		WebElement watchlist = driver.findElement(By.xpath("//*[contains(text(),'Watchlist')]"));
		action.moveToElement(watchlist).click().build().perform();
		
		
		

	}

}
