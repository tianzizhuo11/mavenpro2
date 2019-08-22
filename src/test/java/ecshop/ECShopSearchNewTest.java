package ecshop;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ECShopSearchNewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://localhost/upload/index.php");
	  driver.findElement(By.id("keyword")).sendKeys("移动");
	  driver.findElement(By.name("imageField")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  String res1=driver.findElement(By.xpath("//div[@id='pager']/span/b")).getText();
	  assertEquals(res1, "3");
	  
	  
	  driver.findElement(By.id("keyword")).clear();
	  driver.findElement(By.id("keyword")).sendKeys("移动话费");
	  driver.findElement(By.name("imageField")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  String res2=driver.findElement(By.xpath("//div[@id='pager']/span/b")).getText();
	  System.out.println("************");
	  assertEquals(res2, "0");
	  assertTrue(driver.findElement(By.xpath("html/body/div[7]/div[2]/div[1]/div/div")).getText().contains("无法搜索到您要找的商品"));
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
