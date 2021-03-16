package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		Map<Person, List<Animal>> map = new HashMap<>();
		ZooClub zooClub = new ZooClub();
		Scanner sc = new Scanner(System.in);
		zooClub.add("q", 1, "cat", "mur");
		zooClub.add("Petro", 1, "cat", "mur");
		zooClub.add("Petro", 1, "cat", "mjau");
		zooClub.add("Petro", 2, "cat", "one");
		zooClub.add("Petro", 2, "cat", "one");
		zooClub.add("Stepan", 5, "dog", "rex");
		zooClub.add("Ivan", 6, "dog", "bim");
		zooClub.add("Petro", 2, "dog", "bom");
		try {
		while (true) {
			menu();
			
			switch (sc.nextInt()) {
			case 0:
				System.out.println("Програму завершено");
				return;
			case 1: {				
				zooClub.addPerson();
				break;
			}
			case 2: {				
				zooClub.addAnimal();				
				break;
			}
			case 3:{
				zooClub.removeAnimal();				
				break;
			}
			case 4:{
				zooClub.removePerson();				
				break;
			}
			case 5:{
				zooClub.removeAnimalFromAll();			
				break;
			}
			
			case 6:{				
				System.out.println(zooClub);				
				break;
			}
			default:
				System.out.println("Даного пункту меню не існує");
				break;
			}
		}
			}catch (InputMismatchException e) {
				System.out.println("Даного пункту меню не існує програму завершено ");
			}
		
		
		
		
	}
	
	public static void menu() {
		System.out.println("==========================================");
		System.out.println("Введіть 1 щоб додати учасника клубу ");
		System.out.println("Введіть 2 щоб додати тваринку до учасника клубу ");
		System.out.println("Введіть 3 щоб видалити тваринку з учасника клубу ");
		System.out.println("Введіть 4 щоб Видалити учасника з клубу ");
		System.out.println("Введіть 5 щоб Видалити конкретну тваринку зі всіх власників  ");
		System.out.println("Введіть 6 щоб Вивести на екран зооклуб  ");
		System.out.println("Введіть 0 щоб Вийти з програми ");

	}

}
