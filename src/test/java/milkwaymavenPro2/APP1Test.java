package milkwaymavenPro2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class APP1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testa() {
		assertTrue(true);
		System.out.println("断言成功22");
		System.out.println("APP1");
	}
	
	@Test
	public void testb() {
		assertFalse(true);
		System.out.println("断言失败");
	}

}
