package trainingCourse.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	Thread.sleep(6000);
	driver.manage().window().maximize();
	String windowofhandle =driver.getWindowHandle();
	System.out.println(windowofhandle);
	String currenturlpage = driver.getCurrentUrl();
	System.out.println(currenturlpage);
	driver.close();
	

	}

}
