package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

	@Test
	public void test() {
		Calculatrice calc = new Calculatrice();
		assertEquals(0, calc.auCarre(0));
		assertEquals(1, calc.auCarre(1));
		assertEquals(1, calc.auCarre(-1));
		assertEquals(4, calc.auCarre(-2));
		assertEquals(4, calc.auCarre(2));
	}

}
