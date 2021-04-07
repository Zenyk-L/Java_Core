package ua.lviv.lgs;

import java.util.Set;

public class Application {
	public static void main(String[] args) {

		Map<Integer, String> map = new Map<>();
		map.add(1, "one");
		map.add(2, "two");
		map.add(3, "three");
		map.add(4, "four");
		map.add(5, "five");
		map.add(6, "six");
		map.add(7, "seven");
		map.add(8, "five");

		System.out.println("Our Map: ");
		System.out.println(map);
		System.out.println();

		map.removeByK(3);
		System.out.println(map);
		System.out.println();

		map.removeByV("five");
		System.out.println(map);
		System.out.println();

		map.setOfKeys();
		System.out.println();

		map.listOfValues();

	}
}
