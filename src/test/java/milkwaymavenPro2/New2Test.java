package milkwaymavenPro2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;

public class New2Test {
  @Test
  public void f() {
	  assertTrue(false);
	  System.out.println("1111");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
