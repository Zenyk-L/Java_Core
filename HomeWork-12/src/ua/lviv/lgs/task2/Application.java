package ua.lviv.lgs.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		List<Month> mas = new ArrayList<Month>(Arrays.asList(Month.values())); 		
		List se = new ArrayList(Arrays.asList(Seasons.values()));

		
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter month:");
			String mInputed = sc.next().toUpperCase();

			Month eMonth = monthExist(mas, mInputed);

			menu();

//			} 

			if (eMonth != null) {
				mInputed = sc.next();
				while (!(mInputed.equals("0"))) {
					int ordinal = eMonth.season.ordinal();
					switch (mInputed) {

					case "1": {

						for (Month m : mas) {
							if (m.season.equals(eMonth.season)) {
								System.out.println("In season: " + m.season + " are month: " + m.name());
							}
						}
						menu();
						break;
					}
					case "2": {

						for (Month m : mas) {
							if (!(m.name().equals(eMonth.name())) && (m.day == eMonth.day)) {
								System.out.println("The same number of " + m.day + " days have month: " + m.name());
							}
						}
						menu();
						break;
					}

					case "3": {
						for (Month m : mas) {
							if (m.day < eMonth.day) {
								System.out.println("Have less days " + m.name());
							}
						}

						menu();
						break;
					}

					case "4": {
						for (Month m : mas) {
							if (m.day > eMonth.day) {
								System.out.println("Have more days " + m.name());
							}
						}

						menu();
						break;
					}

					case "5": {

						if (ordinal < 3) {
							System.out.println(se.get(eMonth.season.ordinal() + 1));
						} else {
							System.out.println(se.get(0));
						}

						menu();
						break;
					}

					case "6": {
						if (ordinal > 0) {
							System.out.println(se.get(eMonth.season.ordinal() - 1));
						} else {
							System.out.println(se.get(3));
						}
						menu();
						break;
					}

					case "7": {
						for (Month m : mas) {
							if (m.day % 2 == 0) {
								System.out.println("Місяць " + m.name() + " має парну кількість днів");
							}
						}

						menu();
						break;
					}

					case "8": {
						for (Month m : mas) {
							if (m.day % 2 == 1) {
								System.out.println("Місяць " + m.name() + " має не парну кількість днів");
							}
						}

						menu();
						break;
					}

					case "9": {
						if (eMonth.day % 2 == 0) {
							System.out.println("Місяць " + eMonth.name() + " має парну кількість днів");
						} else {
							System.out.println("Місяць " + eMonth.name() + " має не парну кількість днів");						
						}
						menu();
						break;
					}

					default: {
						System.out.println("Даного пункту меню не існує!!!");
						break;
					}
					}
					mInputed = sc.next();

				}

			}

		}

	}

	private static Month monthExist(List<Month> mas, String mInputed) {
		boolean flag = false;
		Month m1 = null;
		for (Month m : mas) {
			if (m.name().equals(mInputed)) {
				System.out.println("Entered month exist: " + m.name() + " day = " + m.day + " season: " + m.season);

				flag = true;
				m1 = m;
			}
		}
		if (!flag) {
			System.out.println("Entered month dosnt exist.");
		}
		return m1;
	}

	static void menu() {
		System.out.println("===============================================================================");
		System.out.println("Натисніть 1, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 2, щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 3, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 5, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 6, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 7, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
		System.out.println("Натисніть 0, ввести інший місяць");
	}

}
