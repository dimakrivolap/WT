package test1;

import static org.junit.Assert.*;

import org.junit.Test;

import task1.Calculation;

public class CalculationTest 
{
	@Test
	public final void test()
	{
		assertEquals(2.498142903339315, (new Calculation(2, 6)).calculate(), Math.pow(0.1, 15));
		assertEquals(7.222661271360076, (new Calculation(7, 4)).calculate(), Math.pow(0.1, 15));
		assertEquals(0.5, (new Calculation()).calculate(), Math.pow(0.1, 15));
		assertEquals(1.913410905215903, (new Calculation(1, 1)).calculate(), Math.pow(0.1, 15));
	}

}
