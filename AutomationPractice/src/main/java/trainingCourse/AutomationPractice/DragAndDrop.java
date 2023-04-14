package trainingCourse.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement dragme = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action =new Actions(driver);
		action.dragAndDrop(dragme,drop).build().perform();
		driver.switchTo().parentFrame();
		WebElement dialog = driver.findElement(By.linkText("Dialog"));
		dialog.click();
		
		
	}

}
