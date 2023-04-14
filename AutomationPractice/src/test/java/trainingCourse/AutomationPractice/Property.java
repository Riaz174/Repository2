package trainingCourse.AutomationPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Utilities;

public class Property extends Utilities{
  @Test
  public void f() throws IOException {
	  Properties pro = new Properties();
	  FileInputStream ds = new FileInputStream("C:\\Users\\riaz_\\git\\repository2\\AutomationPractice\\Ahmar properties");
	  pro.load(ds);
	  String name = pro.getProperty("Username");
	  System.out.println(name);
	  
	  List<WebElement> linked = driver.findElements(By.tagName("a"));
	  System.out.println(linked.size());
  }
}
