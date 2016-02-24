package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		assertNotNull(test);
	}
	
	@Test
	public void testGetTotal() {
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		int temp = test.getTotal();
		assertEquals(0, temp);					//since total = 0, temp should equal 0
	}
	
	@Test
	public void testAdd() {
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		test.add(3);
		assertEquals(3, test.getTotal());	//since total = 0, 0+3 should equal 3
	}

	@Test
	public void testSubtract() {
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		test.subtract(1);
		assertEquals(0-1, test.getTotal());	//since total = 0, 0-1 should equal -1
	}
	
	@Test
	public void testMultiply() {	
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		test.multiply(3);	
		assertEquals(0, test.getTotal());	//since total = 0, 0*3 should equal 0
	}

	@Test
	public void testDivide() {
		Calculator test = new Calculator();		//since test is new Object, total should equal 0
		test.divide(1);
		assertEquals(0, test.getTotal());	//since total = 0, 0/1 should equal 0
	}

	@Test
	public void testHistory() {
		Calculator test = new Calculator();
		String temp = test.getHistory();
		assertEquals("0", temp);
	}


}
