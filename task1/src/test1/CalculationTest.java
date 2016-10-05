package test1;

import org.junit.Test;
import static org.junit.Assert.*;
import task1.Calculation;

public class CalculationTest 
{
	@Test
	public final void test()
	{
		assertEquals(2.417761723240206, (new Calculation(2, 2)).calculate(), Math.pow(0.1, 15));
		assertEquals(1.665961387696935, (new Calculation(1, 4)).calculate(), Math.pow(0.1, 15));
		assertEquals(0.5, (new Calculation()).calculate(), Math.pow(0.1, 15));
		assertEquals(3.218816801217742, (new Calculation(3, 3)).calculate(), Math.pow(0.1, 15));
	}

}
