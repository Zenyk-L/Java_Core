package ua.lviv.lgs;

public class Circle {
	
	private double radius, diameter;
	
	Circle (double radius) {
		this.radius = radius;
		this.diameter = radius * 2;
	}
	
	public void squareCircle () {
		System.out.println("Площа кола з діаметром " + this.diameter + " = " + (3.14 / 4) * this.diameter * this.diameter);
	}
	
	public void lengthCircle () {
		System.out.println("Довжина кола з радіусом " + this.radius + " = " + 2 * 3.14 * this.radius);
	}
	

}
