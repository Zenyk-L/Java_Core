package ua.lviv.lgs;

public class Su_27 extends Plane implements Speedable, Visiable, Strikable {
	int maxSpeed;
	String color;
	planeControl p = new planeControl();
	

	public Su_27(double lenght, double width, double weight, int maxSpeed, String color) {
		super(lenght, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public void speed() {
		System.out.println("Увімкнуто прискорення, шкидкість " + (maxSpeed + (int)(Math.random()*maxSpeed)));
	};
	
	public void unvisible() {
		System.out.println("Увімкнуто режим невидимості на " + (int)(Math.random()*10));
	};
	public void strike() {
		System.out.println("Скинуто боєголовок " + (int)(Math.random()*10));
	};
	
	public void up() {
		p.moveUp();
	} 
	
	public void down() {
		p.moveDown();
	} 
	
	public void left() {
		p.moveLeft();
	} 
	
	public void right() {
		p.moveRight();
	}
	
	
	

	@Override
	public String toString() {
		return "Su_27 [maxSpeed=" + maxSpeed + ", color=" + color + ", getLenght()=" + getLenght() + ", getWidth()="
				+ getWidth() + ", getWeight()=" + getWeight() + "]";
	}
	
	
}
