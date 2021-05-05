package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parlament {
	List<Fraction> rada = new ArrayList();
	Scanner sc = new Scanner(System.in);

	public void addFraction(String name) {
		Fraction fraction1 = new Fraction(name);
		rada.add(fraction1);
	}

	public void addFraction() {
		System.out.println("Ввведіть назву фракції: ");
		String name = sc.next();
		if (rada.stream().anyMatch(fraction -> fraction.getNameFraction().equalsIgnoreCase(name))) {
			System.out.println("Дана фракція вже існує");
		} else {
			rada.add(new Fraction(name));
			System.out.println("Фракцію додано.");
		}
	}

	public void addFraction(Fraction fraction1) {
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
		rada.stream().forEach(fraction -> System.out.println(fraction));
	}

	public void showFraction(String name) {
		if (rada.stream().anyMatch(fraction -> fraction.getNameFraction().equalsIgnoreCase(name))) {
			System.out.println(rada.stream().filter(fraction -> fraction.nameFraction.equalsIgnoreCase(name))
					.collect(Collectors.toList()));
		} else
			System.out.println(" Даної фракції не існує ");
	}

	public void addDeputy() {
		System.out.println("Додати депутата в фракцію : ");
		String name = sc.next();
		if (rada.stream().anyMatch(fraction -> fraction.getNameFraction().equalsIgnoreCase(name))) {
			rada.stream().forEach(fraction -> {
				if (fraction.getNameFraction().equalsIgnoreCase(name)) {
					fraction.addDeputy();
					System.out.println("Депутата додано.");
				}
			});
		} else
			System.out.println("Даної фракції не існує. ");
	}

	public void removeDeputy() {
		System.out.println(" Видалити депутата з прізвищем: ");
		String surname = sc.next();
		System.out.println(" Видалити депутата з іменем: ");
		String name = sc.next();
		rada.stream().forEach(fraction -> fraction.removeDeputy(surname, name));
	}

	public void showAllBriber() {		
		rada.stream().forEach(fraction -> fraction.showAllBriber());
	}


	public void showMaxBriber() {
		List<Deputy> briberList = new ArrayList<Deputy>();
		rada.stream().forEach(fraction -> {briberList.addAll(fraction.getFraction().stream().filter(Deputy::isBribeTaker).collect(Collectors.toList()));});

		System.out.println(briberList.stream().collect(Collectors.maxBy(Comparator.comparing(Deputy::getBribe))));

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
