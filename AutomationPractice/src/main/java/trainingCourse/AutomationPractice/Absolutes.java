package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//WebElement search = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
		//search.click();
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("abcde");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
		login.click();
		Thread.sleep(3000);
		WebElement forgottonpassword = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
		forgottonpassword.click();
		Thread.sleep(3000);
		WebElement createnewaccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		createnewaccount.click();

	}

}
