package test;

import static org.junit.jupiter.api.Assertions.*;
import tatoo.Principal;

import org.junit.jupiter.api.Test;

class PrincipalTest {

	@Test
	void test() {
		assertEquals(11,Principal.getValor());
	}

}
