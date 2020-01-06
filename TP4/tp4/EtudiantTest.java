package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EtudiantTest extends Etudiant{

	@Test
	void test() {
		assertEquals(1, getNbEtudiants());
	}

}
