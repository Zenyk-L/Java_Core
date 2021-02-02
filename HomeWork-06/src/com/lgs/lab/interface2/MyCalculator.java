package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {
		
	 public void plus(double a, double b) {
		System.out.println(a +" + "+ b +" = "+ (a+b));
	} 
	 
	 public void minus(double a, double b) {
			System.out.println(a + " - "+ b +" = "+ (a-b));
		} 

	 
	 public void multiply(double a, double b) {
			System.out.println(a +" x "+ b +" = "+ a*b);
		} 

	 
	 public void devide(double a, double b) {
			System.out.println(a +" / "+ b +" = "+ a/b);
		} 
}
