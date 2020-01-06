package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Employ�Test {

	@Test
	void test() {
		Employ� emp = new Employ�("f","s", 22, 3000, "d");
		assertEquals("f", emp.nom);
		assertEquals("s", emp.prenom);
		assertEquals(22, emp.numRegistreNational);
		assertEquals(3000, emp.salaire);
		assertEquals("d", emp.employeur);
		assertEquals(true, emp.equals(new Employ�("f","s", 22, 3000, "d")));
		assertEquals(false, emp.equals(new Employ�("f","s", 22, 3000, "a")));
		assertEquals("Employ� [salaire=3000, employeur=d, nom=f, prenom=s, numRegistreNational=22]", emp.toString() );
	}

}
