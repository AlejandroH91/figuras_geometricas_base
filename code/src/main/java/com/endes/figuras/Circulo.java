package com.endes.figuras;

public class Circulo extends FiguraGeometrica {
	
		private Punto centro;
		private double radio;
	

	public Circulo(String nombre, String color, Punto centro, double radio) {
		super(nombre, color);
		
		this.centro = centro;
		this.radio = radio;
		
	}

	@Override
	public double area() {
		
		
		return Math.PI*radio;
	}

	@Override
	public double perimetro() {
		
		return 2 * Math.PI * radio;
	}
	
	public void rotar (double angulo) {
		
		
		
	}
	
	public void trasladar (double dx, double dy) {
		
		
	}
	
	
	
	

}
