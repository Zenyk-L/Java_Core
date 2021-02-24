package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Parlament {
	List<Fraction> rada = new ArrayList();
	Scanner sc = new Scanner(System.in);

	public void addFraction(String name) {
		Fraction fraction1 = new Fraction();
		fraction1.nameFraction = name;
		rada.add(fraction1);
	}
	
	public void addFraction() {
		System.out.println("Ввведіть назву фракції: ");
		String name = sc.next();
		Fraction fraction1 = new Fraction();
		fraction1.nameFraction = name;
		rada.add(fraction1);
	}

	public void addFraction(String name, Fraction fraction1) {
		fraction1.nameFraction = name;
		rada.add(fraction1);
	}

	public void removeFraction() {
		String name = sc.next();
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction next = iterator.next();
			if (next.getNameFraction().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
	}

	public void showAllFraction() {
		Iterator<Fraction> iterator1 = rada.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
	}

	public void showFraction(String name) {
		Iterator<Fraction> iterator1 = rada.iterator();
		while (iterator1.hasNext()) {
			Fraction next = iterator1.next();
			if (next.nameFraction.equalsIgnoreCase(name)) {
				System.out.println(next);
			}
		}
	}

	public void addDeputy() {
		System.out.println("Додати депутата в фракцію : ");
		String name = sc.next();
		boolean fractionExist = false;
		for (int i = 0; i < rada.size(); i++) {
			if (rada.get(i).nameFraction.equalsIgnoreCase(name)) {
				rada.get(i).addDeputy();
				fractionExist = true;
				System.out.println("Депутата додано.");
			}
		}
		if (fractionExist == false) {
			System.out.println("Даної фракції не існує. ");
		}

	}

	public void removeDeputy() {
		System.out.println(" Видалити депутата з прізвищем: ");
		String surname = sc.next();
		System.out.println(" Видалити депутата з іменем: ");
		String name = sc.next();
		for (Fraction f : rada) {
			f.removeDeputy(surname, name);

		}
	}

	public void showAllBriber() {
		System.out.println("В фракції : ");
		String name = sc.next();
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.nameFraction.equalsIgnoreCase(name)) {
				fraction1.showAllBriber();
			}
		}
	}
	
	public void showAllBriber(String name) {
		
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.nameFraction.equalsIgnoreCase(name)) {
				fraction1.showAllBriber();
			}
		}
	}

	public void showMaxBriber() {
		System.out.println("В фракції : ");
		String name = sc.next();
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.nameFraction.equalsIgnoreCase(name)) {
				fraction1.showMaxBriber();
			}
		}
	}
	
	public void showMaxBriber(String name) {
		
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction fraction1 = iterator.next();
			if (fraction1.nameFraction.equalsIgnoreCase(name)) {
				fraction1.showMaxBriber();
			}
		}
	}

	public List<Fraction> getRada() {
		return rada;
	}

	public void setRada(List<Fraction> rada) {
		this.rada = rada;
	}

	@Override
	public String toString() {
		return "rada = \n" + rada + "]";
	}

}
