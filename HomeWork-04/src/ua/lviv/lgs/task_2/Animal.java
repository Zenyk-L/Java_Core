package ua.lviv.lgs.task_2;

public class Animal {
	
	private String name;
	private double speed;
	private int age;
	
	Animal (){
		this.name = "Леопард";
		this.speed = 20;
		this.age = 7;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return 
				"Назва тварини = " + getName() + ", Швидкість тварини = " + getSpeed() +" км/год, Вік тварини = " + getAge() + " років ";
				
	}
	
	

}
