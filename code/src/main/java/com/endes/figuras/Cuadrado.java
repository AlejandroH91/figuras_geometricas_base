package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
	private Punto esquina;
	private double lado;
	
	public Cuadrado(String nombre, String color,Punto esquina, double lado) {
		super(nombre, color);
		this.esquina=esquina;
		this.lado=lado;
		
	}

	@Override
	public double area() {
		return lado*lado;
	}

	@Override
	public double perimetro() {
		return lado*4;
	}
	

}
