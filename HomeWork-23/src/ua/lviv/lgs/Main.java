package ua.lviv.lgs;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Parlament r = new Parlament();
		Fraction f = new Fraction("two");
		Fraction f1 = new Fraction("One");
		Scanner sc = new Scanner(System.in);
		Deputy d = new Deputy("Petrenko", "Petro", 50, false);

		f1.add("one", "Petro", 50, true);
		f1.add("two", "ivan", 50, false);
		f1.add("three", "Pi", 50, false);

		f.add("Petrenko", "Petro", 50, false);
		f.add("Ivanenko", "Petro", 50, false);
		f.add("Sydorenko", "Petro", 50, false);
		f.add("Sydor", "Petro", 50, true);
		f.add("Renko", "Petro", 50, false);
		f.add("Syd", "Petro", 50, true);
		f.add("Dora", "Petro", 50, true);
		f.getFraction().get(3).giveBribe();
		f.getFraction().get(5).giveBribe();

//		System.out.println(f);
		r.addFraction(f1);
		r.addFraction(f);
		r.addFraction("three");

		try {
			while (true) {
				menu();
				switch (sc.nextInt()) {
				case 1: {
					r.addFraction();
					break;
				}
				case 2: {
					r.removeFraction();
					System.out.println("Фракцію видалено.");
					break;
				}
				case 3: {
					r.showAllFraction();
					break;
				}
				case 4: {
					System.out.println("Яку фракцію очистити :");
					String fractionName = sc.next();
					for (int i = 0; i < r.getRada().size(); i++) {
						if (r.getRada().get(i).getNameFraction().equalsIgnoreCase(fractionName)) {
							r.getRada().get(i).removeAllDeputy();
						}
					}
					break;
				}

				case 5: {
					System.out.println("Яку фракцію вивести :");
					String fractionName = sc.next();
					r.showFraction(fractionName);
					break;
				}

				case 6: {
					r.addDeputy();
					;

					break;
				}

				case 7: {
					r.removeDeputy();

					break;
				}

				case 8: {
					r.showAllBriber();
//					Iterator<Fraction> iterator = r.getRada().iterator();
//					while (iterator.hasNext()) {
//						Fraction next = iterator.next();
//						r.showAllBriber(next.nameFraction);
//					}
					break;
				}

				case 9: {
					r.showMaxBriber();
//					Iterator<Fraction> iterator1 = r.getRada().iterator();
//					while (iterator1.hasNext()) {
//						Fraction next = iterator1.next();
//						r.showMaxBriber(next.nameFraction);
//					}
					break;
				}

				case 0: {
					System.out.println("Дати хабар депутату: ");
					System.out.println(" Введіть прізвище ");
					String surname = sc.next();
					System.out.println(" Введіть імя ");
					String name = sc.next();
					Iterator<Fraction> iterator2 = r.getRada().iterator();
					while (iterator2.hasNext()) {
						Fraction next = iterator2.next();
						Iterator<Deputy> iterator3 = next.getFraction().iterator();
						while (iterator3.hasNext()) {
							Deputy nextDeputy = iterator3.next();
							if ((nextDeputy.surname.equalsIgnoreCase(surname))
									&& (nextDeputy.name.equalsIgnoreCase(name))) {
								nextDeputy.giveBribe();
							}
						}
					}
					break;
				}

				default:
					break;
				}

			}
		} catch (java.util.InputMismatchException ex) {
			System.out.println("Даного пунктц меню не існує");
		}

	}

	public static void menu() {
		System.out.println("==========================================");
		System.out.println("Введіть 1 щоб додати фракцію ");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію ");
		System.out.println("Введіть 3 щоб вивести усі  фракції ");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію ");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію  ");
		System.out.println("Введіть 6 щоб додати депутата в фракцію  ");
		System.out.println("Введіть 7 щоб видалити депутата з фракції  ");
		System.out.println("Введіть 8 щоб вивести список хабарників  ");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника  ");
		System.out.println("Введіть 0 щоб дати хабар ");

	}

}
