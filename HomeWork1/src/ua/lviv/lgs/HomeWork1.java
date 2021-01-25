package ua.lviv.lgs;

public class HomeWork1 {
	public static void main(String[] args) {
//		Завдяння 1:
		
		byte a = 2; 
		short b = 5;
		int c = 10;
		long d = 45;
		char e = 'a';
		float f = 2.599f;
		double g = 6.499; 
		boolean h = true;
		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		System.out.println(" c = " + c);
		System.out.println(" d = " + d);
		System.out.println(" e = " + e);
		System.out.println(" f = " + f);
		System.out.println(" g = " + g);
		System.out.println(" h = " + h);
		System.out.println("=======================================");
		
		
//		Завдяння 2:	
		
		System.out.println( "Byte min = " + Byte.MIN_VALUE);
		System.out.println( "Byte max = " + Byte.MAX_VALUE);
		
		System.out.println( "Short min = " + Short.MIN_VALUE);
		System.out.println( "Short max = " + Short.MAX_VALUE);
		
		System.out.println( "Integer min = " + Integer.MIN_VALUE);
		System.out.println( "Integer max = " + Integer.MAX_VALUE);
		
		System.out.println( "Long min = " + Long.MIN_VALUE);
		System.out.println( "Long max = " + Long.MAX_VALUE);
		
		System.out.println( "Character min = " + Character.MIN_VALUE);
		System.out.println( "Character max = " + Character.MAX_VALUE);
		
		System.out.println( "Float min = " + Float.MIN_VALUE);
		System.out.println( "Float max = " + Float.MAX_VALUE);
		
		System.out.println( "Double min = " + Double.MIN_VALUE);
		System.out.println( "Double max = " + Double.MAX_VALUE);
		
		System.out.println( "Boolean min = " + Boolean.TRUE);
		System.out.println( "Boolean max = " + Boolean.FALSE);
		
		System.out.println("=======================================");
		
		
		
//		Завдяння 3:
		
		int [] array = {9, 8, 5, 6, 3, 4, 1, 2, 0, 7};
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {			
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
			
		} 
		
		System.out.println("min = " + min);
		
		System.out.println("max = " + max);
		
//		first commit to gitHub
		
	}

}
