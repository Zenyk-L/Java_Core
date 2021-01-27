package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle();
		
		Rectangle R2 = new Rectangle(1, 2);
		
		Circle C1 = new Circle (5);
		
				
		System.out.println("Площа прямокутника зі сторонами "+ R1.getLength() + " х " + R1.getWidth() + " = "+ R1.square());
		
		System.out.println("Периметр прямокутника зі сторонами "+ R1.getLength() + " х " + R1.getWidth() + " = "+ R1.perimeter());
		
		System.out.println();
		
		System.out.println("Площа прямокутника зі сторонами "+ R2.getLength() + " х " + R2.getWidth() + " = "+ R2.square());
		
		System.out.println("Периметр прямокутника зі сторонами "+ R2.getLength() + " х " + R2.getWidth() + " = "+ R2.perimeter());
		
		System.out.println();
		
		C1.squareCircle ();
		C1.lengthCircle();
		
	}

}
