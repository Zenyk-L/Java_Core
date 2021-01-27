package ua.lviv.lgs;

public class Rectangle {
	
	private double length, width;
	
	Rectangle (){
		this.length = 10;
		this.width = 20;
	}
	
	Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
		
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double square () {
		return this.length * this.width;
	}
	
	public double perimeter () {
		return (this.length + this.width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	
	
}
