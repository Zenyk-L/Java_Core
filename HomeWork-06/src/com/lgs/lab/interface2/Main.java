package com.lgs.lab.interface2;

public class Main {
	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator();
		
		double a = 7, b = 3;
		
		m.plus(a, b);
		m.minus(a, b);
		m.multiply(a, b);
		m.devide(a, b);
	}

}
