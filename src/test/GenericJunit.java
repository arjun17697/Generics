package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.generic;

public class GenericJunit {
	

	@Test
	public void returnmaxinteger() {
		generic tester= new generic();
		Integer[] intArray=new Integer[] {3,2,1};
		int result= generic.maxint_uc1(intArray);
		Assert.assertEquals(3,result);
	}
	
	@Test
	public void returnmaxinteger1() {
		generic tester= new generic();
		Integer[] intArray=new Integer[] {99,128,65};
		int result= generic.maxint_uc1(intArray);
		Assert.assertEquals(128,result);
	}

	@Test
	public void returnmaxinteger2() {
		generic tester= new generic();
		Integer[] intArray=new Integer[] {89,128,6999};
		int result= generic.maxint_uc1(intArray);
		Assert.assertEquals(6999,result);
	}

}

