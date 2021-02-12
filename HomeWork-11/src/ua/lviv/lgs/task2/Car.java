package ua.lviv.lgs.task2;

public class Car {
	int horsePower;
	int year;
	
	public Car(int horsePower, int year) {		
		this.horsePower = horsePower;
		this.year = year;
	}

	public String toString() {
		return "Car [horsePower=" + horsePower + ", year=" + year + "]";
	}
}
