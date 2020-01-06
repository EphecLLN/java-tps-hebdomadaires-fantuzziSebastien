package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ind�pendantTest {

	@Test
	void test() {
		Ind�pendant ind = new Ind�pendant("f","s", 22, "0.1");
		assertEquals("f", ind.nom);
		assertEquals("s", ind.prenom);
		assertEquals(22, ind.numRegistreNational);
		assertEquals("0.1", ind.TVA);
		assertEquals(true, ind.equals(new Ind�pendant("f","s", 22, "0.1")));
		assertEquals(false, ind.equals(new Ind�pendant("f","s", 22, "1")));
		assertEquals("Ind�pendant [TVA=0.1, nom=f, prenom=s, numRegistreNational=22]", ind.toString() );
	}

}
