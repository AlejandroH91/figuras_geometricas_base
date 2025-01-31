package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuadradoTest {
	Punto punto = new Punto (5, 5);
	Cuadrado cuadrado = new Cuadrado("Pequeño", "azul",punto , 5.0);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("Prueba del método Área)")
	void testArea() {
		double resultadoEsperado = 25;
		assertEquals(resultadoEsperado, cuadrado.area(), "El área no coincide");
	}
	
	@Test
	@DisplayName("Prueba del método Perímetro)")
	void testPerimetro() {
		double resultadoEsperado = 20;
		assertEquals(resultadoEsperado, cuadrado.perimetro(), "El perímetro no coincide");
	}

}
