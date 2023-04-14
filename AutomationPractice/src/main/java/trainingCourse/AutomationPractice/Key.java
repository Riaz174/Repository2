package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		//WebElement type = driver.findElement(By.id("captchacharacters"));
		//type.sendKeys("abcde");
		Thread.sleep(3000);
		//WebElement cont = driver.findElement(By.xpath("//button[@type='submit']"));
		//cont.click();
		//Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
		searchbox.sendKeys("computer");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		searchbox.clear();
		Thread.sleep(3000);
		searchbox.click();
		Thread.sleep(3000);		
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		

	}

}
