package Test_Package;

import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Maven_Package.Calculator;
import junit.framework.Assert;

public class Calculator_Test {
	public static Calculator objCalculator;

	@Before
	public void setup() throws Exception {
		objCalculator=new Calculator();
	}

	@After
	public void tearDown() throws Exception {

	System.out.println("closing ");
	}

	@Test
	public void additionTest() {

	assertEquals(25, objCalculator.addition(12, 13));
	}

	@Test
	public void substractionTest(){
		assertEquals(-1,objCalculator.substraction (12, 13));
	}

	@Test
	public void divisionTest(){
		assertEquals(0,objCalculator.division(12, 13));
	}
	
	@Test
	public void MultiplyTest(){
		assertEquals(156,objCalculator.Multiplication (12, 13));
	}
	
}

