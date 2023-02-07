package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flights = driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath("//*[@data-name='d1']"));
		departure.click();
		Thread.sleep(3000);
		WebElement departureofdate = driver.findElement(By.xpath("//button[@aria-label='Feb 27, 2023']"));
		departureofdate.click();
		

	}

}
