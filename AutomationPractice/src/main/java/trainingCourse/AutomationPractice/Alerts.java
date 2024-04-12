package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement alerts = driver.findElement(By.name("alert"));
		alerts.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebElement confirmation = driver.findElement(By.name("confirmation"));
		confirmation.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Alert is displayed");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		

	}

}
