package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	public static 	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createnewaccount = driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();
		Thread.sleep(3000);
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select ob = new Select(birthday);
		ob.selectByIndex(6);
		Thread.sleep(3000);
		WebElement birthofmonth = driver.findElement(By.name("birthday_month"));
		Select se = new Select(birthofmonth);
		se.selectByVisibleText("Jul");
		Thread.sleep(3000);
		WebElement birthofyear = driver.findElement(By.name("birthday_year"));
		Select ye = new Select(birthofyear);
		ye.selectByValue("2018");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
		
		
		

	}

}
