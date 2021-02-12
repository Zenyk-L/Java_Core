package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int menuCase;

		Car[] array = new Car[newCarArray().length];
		array = newCarArray();

//		System.out.println(Arrays.deepToString(array));
		do {
			menu();
			menuCase = sc.nextInt();

			switch (menuCase) {
			case 1: {
				System.out.println(Arrays.deepToString(array));
				break;
			}
			case 2: {
				Arrays.fill(array, new Car(500, 2021));
				System.out.println("Масив перезаповнено автом 500 к.с. 2021 р.в.");
				break;
			}
			case 3: {
				array = newCarArray();
				System.out.println("Новий масив авто згенеровано");
				break;
			}
			}
		} while (menuCase != 0);

	}

	public static Car[] newCarArray() {
		Random r = new Random();
		Car[] array = new Car[r.nextInt(20)];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Car(getRandomInRage(4, 520), getRandomInRage(1890, 2021));
		}
		return array;

	}

	public static int getRandomInRage(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max vale");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

	static void menu() {
		System.out.println("===============================================================================");
		System.out.println("Натисніть 1, щоб вивести масив авто на екран");
		System.out.println("Натисніть 2, щоб перезаповнити масив автом 500 к.с. 2021 р.в.");
		System.out.println("Натисніть 3, щоб згенерувати новий масив");
		System.out.println("Натисніть 0, завершити програму");
	}

}
