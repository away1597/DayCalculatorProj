import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
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
}
