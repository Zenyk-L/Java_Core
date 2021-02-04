package ua.lviv.lgs;

public abstract class Plane {

	private double lenght;
	private double width;
	private double weight;
	
		
	public Plane(double lenght, double width, double weight) {
		super();
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

	public void engineStart() {
		int minReadyTime = 20;
		int maxReadyTime = 88;
		System.out.println("До взлету залишилось " +  (minReadyTime + (int)(Math.random()*(maxReadyTime-minReadyTime+1))));
	}
	
//	public void depature() {
//		System.out.println("Максимальна дальність польоту " + Math.random()*1001 );
//	}
	
	public void depature() {
	System.out.println("Максимальна дальність польоту " + Math.random()*1001 );
}
	
	public void arrive() {
		System.out.println("Літак іде на посадку");
	}

	public double getLenght() {
		return lenght;
	}

	public double getWidth() {
		return width;
	}

	public double getWeight() {
		return weight;
	}
}
