package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle();
		
		Rectangle R2 = new Rectangle(1, 2);
		
		Circle C1 = new Circle (5);
		
				
		System.out.println("����� ������������ � ��������� "+ R1.getLength() + " � " + R1.getWidth() + " = "+ R1.square());
		
		System.out.println("�������� ������������ � ��������� "+ R1.getLength() + " � " + R1.getWidth() + " = "+ R1.perimeter());
		
		System.out.println();
		
		System.out.println("����� ������������ � ��������� "+ R2.getLength() + " � " + R2.getWidth() + " = "+ R2.square());
		
		System.out.println("�������� ������������ � ��������� "+ R2.getLength() + " � " + R2.getWidth() + " = "+ R2.perimeter());
		
		System.out.println();
		
		C1.squareCircle ();
		C1.lengthCircle();
		
	}

}
