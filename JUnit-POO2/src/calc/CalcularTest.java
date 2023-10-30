package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcularTest {

	@Test
	void media() {
		Calcular c = new Calcular();
		double[] v = {3,2,3,2,0};
		assertEquals(2, c.Media(v));
	}
	
	@Test
	void moda() {
		Calcular c = new Calcular();
		double[] v = {3,2,3,2,3};
		assertEquals(3, c.Moda(v));
	}
	
	@Test
	void mediana() {
		Calcular c = new Calcular();
		double[] v = {3,2,2,3};
		assertEquals(2.5, c.Mediana(v));
	}
	
	@Test
	void variancia() {
		Calcular c = new Calcular();
		double[] v = {10,9,11,12,8};
		assertEquals(2, c.Variancia(v));
	}
	
	@Test
	void desvio() {
		Calcular c = new Calcular();
		double[] v = {10,9,11,12,8};
		assertEquals(Math.sqrt(2), c.DesvioPadrao(v));
	}

}
