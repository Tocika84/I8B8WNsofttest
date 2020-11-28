package hu.meiit.i8b8wn.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TerfogatTest {
	Terfogat teglatest = null;

	@Before
	public void init() {
		teglatest = new Terfogat();
	}

	@Test
	public void testteglatest() {
		
		int expected = 30;
		int result = teglatest.TeglaV(3, 2, 5) ;
		
		assertEquals(expected, result);
	}

}
	