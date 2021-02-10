package ua.lviv.lgs;

import java.util.Scanner;

public class Task1_Polindrom {
	public static void main(String[] args) {

		while (true) {
			System.out.println("¬вед≥ть слово з 5 букв: ");
			Scanner sc = new Scanner(System.in);

			String word1 = sc.next();
			StringBuffer word2 = new StringBuffer(word1.toLowerCase());
			word2.reverse();

			if (word1.length() > 5) {
				System.out.println("¬и ввели слово б≥льше н≥ж з 5 букв");
			} else if (word1.length() < 5) {
				System.out.println("¬и ввели слово менше н≥ж з 5 букв");
			} else if (word1.length() == 5) {
				if (word1.toLowerCase().equals(word2.toString())) {
					System.out.println("¬ведене вами слово пал≥ндром:  " + word1);					
				}else {
					System.out.println("¬ведене вами слово не пал≥ндром:  " + word1);
				}
			}
		}
	}

}
