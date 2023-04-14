package trainingCourse.AutomationPractice;

import org.testng.annotations.Test;



import facebook.pages.HomeOfFacebook;


import Common.Utilities;
import org.testng.annotations.DataProvider;

public class Points extends Utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.Username(n);
	  home.Password(s);
	  home.login();
	   }

  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {
      new Object[] { "Ali", "august" },
      new Object[] { "Saleem", "basemewnt" },
      new Object[] {"Rabiya", "castle"},
    };
  }
}
