package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

public class Person implements Serializable {

	@MyAnnotation
	private String name;
	@MyAnnotation("lastname will be saved")
	private String lastName;
	@MyAnnotation("age will be saved")
	private int age;
	private int height;
	private int weight;

	public Person() {
	}

	public Person(String name, String lastName, int age, int height, int weight) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", weight="
				+ weight + "]";
	}

	public void saveAnnotatedFields(File file) throws IllegalArgumentException, IllegalAccessException, IOException {

		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);

		Person tempPerson = new Person();

		Field[] fields = this.getClass().getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				field.set(tempPerson, field.get(this));
			}
		}
		oos.writeObject(tempPerson);
		oos.close();
		os.close();
		System.out.println("Saved to a file:");
		System.out.println(tempPerson);
	}

	public void getPersonFromFile(File file) throws IOException, ClassNotFoundException {
		InputStream inf = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(inf);

		Object person = ois.readObject();
		System.out.println();
		System.out.println("Person from file: ");
		System.out.println(person);
		ois.close();
		inf.close();
	}

}
