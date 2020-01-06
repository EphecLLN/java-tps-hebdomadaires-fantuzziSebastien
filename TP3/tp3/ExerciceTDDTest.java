package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciceTDDTest {

	@Test
	void test() {
		ExerciceTDD ex = new ExerciceTDD();
		assertEquals(true, ex.estPair(2));
		assertEquals(false, ex.estPair(1));
		assertEquals(true, ex.estPair(0));
		assertEquals(4, ex.perimetreCarre(1));
		assertEquals(-16, ex.perimetreCarre(-4));
		assertEquals(true, ex.contientCaractere("s"));
		assertEquals(false, ex.contientCaractere("w"));
	}

}
