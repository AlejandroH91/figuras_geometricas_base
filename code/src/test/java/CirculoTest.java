package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CirculoTest {
	
	Circulo circulo = new Circulo ("Grande", "morado", 5);
	
	@BeforeAll
	satic void setUpBeforeClass() throws Exception {
		
		
	}

	@Test
	@DisplayName ("Prueba del método área")
	void testArea() {
		double resultadoEsperado = 25;
		assertEquals(resultadoEsperado, circulo.area(), "El area no coincide" );
	
		
	}
	
	@Test
	@DisplayName ("Prueba del método Peímetro")
	void testPerimetro() {
		double resultadoEsperado = 20;
		assertEquals(resultadoEsperado, circulo.perimetro(), "El perímetro no coincide" );
		

}
