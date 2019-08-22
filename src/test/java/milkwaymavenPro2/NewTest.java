package milkwaymavenPro2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  assertTrue(true);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
