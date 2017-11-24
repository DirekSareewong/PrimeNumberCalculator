package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import prime.PrimeNumberCalculator;

public class TestPrimeNumberCalculator {

	int toTestNumber;
	
	@Before
	public void setup(){
		toTestNumber = 17;
	}
	
	@Test
	public void testIsPrimeNumber() {
		try {
			if(!PrimeNumberCalculator.IsPrimeNumber(toTestNumber))
				fail("Not yet implemented");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
