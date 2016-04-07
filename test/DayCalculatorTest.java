import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class DayCalculatorTest {

	static DayCalculator dayCalculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dayCalculator = new DayCalculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Mon", dayCalculator.getDay(1, 1, 1));
	}
		
	@Test
	public void test00010102(){
		assertEquals("Tue", dayCalculator.getDay(1, 1, 2));
	}
	
	@Test
	public void test00010103(){
		assertEquals("Wed", dayCalculator.getDay(1, 1, 3));
	}
	
	@Test
	public void test00010104(){
		assertEquals("Thu", dayCalculator.getDay(1, 1, 4));
	}
	
	@Test
	public void test00010110(){
		assertEquals("Wed", dayCalculator.getDay(1, 1, 10));
	}
	
	@Test
	public void test00010202(){
		assertEquals("Fri", dayCalculator.getDay(1, 2, 2));
	}
	
	@Test
	public void test00010301(){
		assertEquals("Thu", dayCalculator.getDay(1, 3, 1));
	}

	@Test
	public void test00010401(){
		assertEquals("Sun", dayCalculator.getDay(1, 4, 1));
	}
	
	@Test
	public void test00020101(){
		assertEquals("Mon", dayCalculator.getDay(2, 1, 1));
	}
	
	@Test
	public void test00030101(){
		assertEquals("Sun", dayCalculator.getDay(3, 1, 1));
	}
	
	@Test
	public void test00040101(){
		assertEquals("Sat", dayCalculator.getDay(4, 1, 1));
	}
	
	@Ignore
	public void test20160407(){
		assertEquals("Thu", dayCalculator.getDay(2016, 4, 7));
	}
	
	@Test
	public void isLeap(){
		assertFalse(DayCalculator.isLeap(1));
	}
	
	@Test
	public void testIsLeap2(){
		assertFalse(DayCalculator.isLeap(2));
	}
	
	@Test
	public void testIsLeap3(){
		assertFalse(DayCalculator.isLeap(3));
	}
	
	@Test
	public void testIsLeap4(){
		assertTrue(DayCalculator.isLeap(4));
	}
	
	@Test
	public void testIsLeap5(){
		assertFalse(DayCalculator.isLeap(5));
	}
	
	@Test
	public void testIsLeap8(){
		assertTrue(DayCalculator.isLeap(8));
	}
	
	@Test
	public void testIsLeap100(){
		assertFalse(DayCalculator.isLeap(100));
	}
	
	@Test
	public void testIsLeap200(){
		assertFalse(DayCalculator.isLeap(200));
	}
	
	@Test
	public void testIsLeap400(){
		assertTrue(DayCalculator.isLeap(400));
	}
}
