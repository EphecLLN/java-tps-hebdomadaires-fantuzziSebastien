package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatToolBoxTest {
	@Test
	void test() {
		int[] x = {1,2,3};
		StatToolBox test =  new StatToolBox(x);
		assertEquals(2, test.moyenne());
	}
}
