package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZooClub {

	Map<Person, List<Animal>> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	String enteredName;
	String enteredAnimalName;
	int enteredAge;
	String animalType;

	public Person inputedPerson() {
		System.out.println(" ������� �� ��'� :");
		enteredName = sc.next();
		System.out.println("³� �������� :");
		enteredAge = sc.nextInt();
		return new Person(enteredName, enteredAge);
	}

	public Animal inputedAnimal() {
		System.out.println(" ������ ���� :");
		animalType = sc.next();
		System.out.println(" ��'� ������� :");
		enteredAnimalName = sc.next();
		return new Animal(animalType, enteredAnimalName);
	}

	public void addPerson() {
		System.out.print("������ ");
		map.put(inputedPerson(), new ArrayList<Animal>());
	}

	public void addAnimal() {
		System.out.println(" �� ");
		Person tempPerson = inputedPerson();
		List<Animal> animalList = map.get(tempPerson);
		System.out.print("������ ");

		Animal newAnimal = inputedAnimal();

		if (!animalList.contains(newAnimal)) {
			animalList.add(newAnimal);
			map.put(tempPerson, animalList);

		} else {
			System.out.println("���� ������� ��� � � ��������: ");
		}
	}

	public void add(String personName, int personAge, String animalType, String animalName) {
		Person tempPerson = new Person(personName, personAge);
		Animal tempAnimal = new Animal(animalType, animalName);
		List<Animal> tempAnimalList = new ArrayList<Animal>();

		if (map.get(tempPerson) != null) {
			tempAnimalList = map.get(tempPerson);
		}

		if (!tempAnimalList.contains(tempAnimal)) {
			tempAnimalList.add(tempAnimal);
			map.put(tempPerson, tempAnimalList);

		}
	}

	public void removeAnimal() {
		System.out.println(" � ");
		Person tempPerson = inputedPerson();
		List<Animal> animalList = map.get(tempPerson);
		System.out.print(" �������� ");

		Animal newAnimal = inputedAnimal();

		if (animalList.contains(newAnimal)) {
			animalList.remove(newAnimal);
			map.put(tempPerson, animalList);

		} else {
			System.out.println("���� ������� ���� � ��������: ");
		}
	}
	
	public void removeAnimalFromAll() {
//		System.out.println(" � ");
//		Person tempPerson = inputedPerson();
//		List<Animal> animalList = map.get(tempPerson);
		System.out.print(" �������� ");

		Animal newAnimal = inputedAnimal();
		
//		Set setOfKeyPerson = key
		for (Person person: map.keySet()) {
			if (map.get(person).contains(newAnimal)) {
				map.get(person).remove(newAnimal);
			}
		}

//		if (animalList.contains(newAnimal)) {
//			animalList.remove(newAnimal);
//			map.put(tempPerson, animalList);
//
//		} else {
//			System.out.println("���� ������� ���� � ��������: ");
//		}
	}
	
	public void removePerson() {
		System.out.print(" �������� ");
		Person tempPerson = inputedPerson();
		map.remove(tempPerson);		
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
