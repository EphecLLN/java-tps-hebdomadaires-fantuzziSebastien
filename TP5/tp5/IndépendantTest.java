package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndépendantTest {

	@Test
	void test() {
		Indépendant ind = new Indépendant("f","s", 22, "0.1");
		assertEquals("f", ind.nom);
		assertEquals("s", ind.prenom);
		assertEquals(22, ind.numRegistreNational);
		assertEquals("0.1", ind.TVA);
		assertEquals(true, ind.equals(new Indépendant("f","s", 22, "0.1")));
		assertEquals(false, ind.equals(new Indépendant("f","s", 22, "1")));
		assertEquals("Indépendant [TVA=0.1, nom=f, prenom=s, numRegistreNational=22]", ind.toString() );
	}

}
