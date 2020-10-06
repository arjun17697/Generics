package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import main.generic;

public class GenericJunit {

//Test Cases for UC1
	@Test
	public void returnmaxinteger() {
		generic tester = new generic();
		int a,b,c,d,e;
		int result = generic.testMaximum(a=5, b=10, c=70,d=60,e=8);
		Assert.assertEquals(70, result);
	}
	
	@Test
	public void returnmaxfloat() {
		generic tester = new generic();
		 Float   x,y,z,l,m;
		Float result = generic. testMaximum(x=50f, y=10f, z=700f,l=1000f,m=7f);
		Assert.assertEquals(1000.0, result,0.000);
		
}

	@Test
	public void returnmaxstring() {
		generic tester = new generic();
		 String p,q,r,s,t;
		String result = generic. testMaximum(p="Banana", q="Apple", r="Peach",s="Queen",t="King");
		Assert.assertEquals("Queen", result);}
}

	