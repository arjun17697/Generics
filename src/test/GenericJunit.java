package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.generic;

public class GenericJunit {

//Test Cases for UC1
	@Test
	public void returnmaxinteger() {
		generic tester = new generic(null);
		Integer[] inputArray = new Integer[] { 3, 2, 1 };
		int result = generic.max(inputArray);
		Assert.assertEquals(3, result);
	}

	@Test
	public void returnmaxinteger1() {
		generic tester = new generic(null);
		Integer[] intArray = new Integer[] { 99, 128, 65 };
		int result = generic.max(intArray);
		Assert.assertEquals(128, result);
	}

	@Test
	public void returnmaxinteger2() {
		generic tester = new generic(null);
		Integer[] intArray = new Integer[] { 89, 128, 6999 };
		int result = generic.max(intArray);
		Assert.assertEquals(6999, result);
	}

//Test Cases for UC2
	@Test
	public void returnmaxfloat() {
		generic tester = new generic(null);
		Float[] array = new Float[] { 3.45f, 2.67f, 1.45f };
		float result = generic.max(array);
		Assert.assertEquals(3.45f, result, 0.000);

	}

	@Test
	public void returnmaxfloat2() {
		generic tester = new generic(null);
		Float[] array = new Float[] { 3.45f, 8.937f, 1.45f };
		float result = generic.max(array);
		Assert.assertEquals(8.937f, result, 0.000);
	}

	@Test
	public void returnmaxfloat3() {
		generic tester = new generic(null);
		Float[] array = new Float[] { 3.45f, 2.67f, 9.99f };
		float result = generic.max(array);
		Assert.assertEquals(9.99f, result, 0.000);

	}
	
	@Test
	public void returnmaxstring1() {
		generic tester = new generic(null);
		String[] array = new String[] { "peach", "banana", "apple" };
		String result = generic.max(array);
		Assert.assertEquals("peach", result);

	}
	@Test
	public void returnmaxstring2() {
		generic tester = new generic(null);
		String[] array = new String[] { "arjun", "banana", "apple" };
		String result = generic.max(array);
		Assert.assertEquals("banana", result);
}
	@Test
	public void returnmaxstring3() {
		generic tester = new generic(null);
		String[] array = new String[] { "arjun", "banana", "simran" };
		String result = generic.max(array);
		Assert.assertEquals("simran", result);
}
}

