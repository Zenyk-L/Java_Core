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
		System.out.println("�� ������ ���������� " +  (minReadyTime + (int)(Math.random()*(maxReadyTime-minReadyTime+1))));
	}
	
//	public void depature() {
//		System.out.println("����������� �������� ������� " + Math.random()*1001 );
//	}
	
	public void depature() {
	System.out.println("����������� �������� ������� " + Math.random()*1001 );
}
	
	public void arrive() {
		System.out.println("˳��� ��� �� �������");
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
