package test;

import static org.junit.jupiter.api.Assertions.*;
import tatoo.Tatuador;

import org.junit.jupiter.api.Test;

class TatuadorTest {

	@Test
	void testNombre() {
		assertEquals("Oscar", new Tatuador(1, "Oscar").getRut());
	}

	@Test
	void testRut() {
		assertEquals(1, new Tatuador(1, "Oscar").getRut());
	}
	
}
