package milkwaymavenPro2;

import org.testng.annotations.Test;

import utils.Log;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Log4jNewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.baidu.com");
	  Log.info("BaiDu has been loaded");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @BeforeTest
  public void beforeTest() {
	  Log.info("try to open browser");
	  driver=new FirefoxDriver();
	  Log.info("the browser has been opened");
  }

  @AfterTest
  public void afterTest() {
	  Log.info("try to close browser");
	  driver.quit();
	  Log.info("the browser has been closed");
  }

}
