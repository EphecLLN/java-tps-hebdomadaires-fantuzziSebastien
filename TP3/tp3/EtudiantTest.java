package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EtudiantTest {

	@Test
	void test() {
		int[] x = {5,3,7,1,10};
		Etudiant etu = new Etudiant("fantuzzi", "sebastien", 201693, new Date(), x);
		assertEquals(5.2, etu.moyenne());
	}

}
