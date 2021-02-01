package ua.lviv.lgs.task2;

public class Animal {
	
	String name;
	int age;
	double weight;
	int maxSpeed;
	
	Animal(String name2, int age2){
		name = name2;
		age = age2;
	}
	
	Animal(String name1, int age1, double weight1, int maxSpeed1){
		this(name1, age1);
		weight = weight1;
		maxSpeed = maxSpeed1;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", weight=" + weight + ", maxSpeed=" + maxSpeed + "]";
	}

	
}
