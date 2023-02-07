package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewAccount {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement create = driver.findElement(By.xpath("//*[text()='Create new account']"));
		create.click();
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		fname.sendKeys("John");
		Thread.sleep(3000);
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("Doe");
		Thread.sleep(6000);
		WebElement emailfield = driver.findElement(By.name("reg_email__"));
		emailfield.sendKeys("joh@gmail.com");
		Thread.sleep(3000);
		WebElement reenter = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reenter.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		WebElement npassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		npassword.sendKeys("abcde");
			}

}
