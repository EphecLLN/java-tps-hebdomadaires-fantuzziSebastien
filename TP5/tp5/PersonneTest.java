package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonneTest {

	@Test
	void test() {
		Personne p1 = new Personne("f","s", 22);
		assertEquals("f", p1.nom);
		assertEquals("s", p1.prenom);
		assertEquals(22, p1.numRegistreNational);
		assertEquals(true, p1.equals(new Personne("f","s", 22)));
		assertEquals(false, p1.equals(new Personne("g","s", 22)));
		assertEquals("Personne [nom=f, prenom=s, numRegistreNational=22]", p1.toString() );
	}

}
