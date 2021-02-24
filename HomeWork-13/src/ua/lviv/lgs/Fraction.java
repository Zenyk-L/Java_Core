package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	String nameFraction;
	List<Deputy> fraction = new ArrayList();
	Scanner sc = new Scanner(System.in);



	public String getNameFraction() {
		return nameFraction;
	}

	public void setNameFraction(String nameFraction) {
		this.nameFraction = nameFraction;
	}

	public List<Deputy> getFraction() {
		return fraction;
	}

	public void setFraction(List<Deputy> fraction) {
		this.fraction = fraction;
	}

	@Override
	public String toString() {
		return "[name Fraction= " + nameFraction + ", fraction= " + fraction + "]\n";
	}

	public void add(String surname, String name, int age, boolean bribeTaker) {
		fraction.add(new Deputy(surname, name, age, bribeTaker));
	}

	public void addDeputy() {

		System.out.println(" ������ ������� ");
		String surname = sc.next();
		System.out.println(" ������ ��� ");
		String name = sc.next();
		System.out.println(" ������ �� ");
		int age = sc.nextInt();
		System.out.println("����� �������: �������� - ������  1, �� ���� ����� - ������ 0");
		int inputBribe = sc.nextInt();
		boolean bribeTaker;

		while ((inputBribe != 0) & (inputBribe != 1)) {
			System.out.println("������ ������ ���� �� ����:");
			System.out.println("����� �������: �������� - ������  1, �� ���� ����� - ������ 0");
			inputBribe = sc.nextInt();
		}

		if (inputBribe == 0) {
			bribeTaker = false;
		} else {
			bribeTaker = true;
		}

		fraction.add(new Deputy(surname, name, age, bribeTaker));
	}

	public void removeDeputy() {
		System.out.println(" �������� �������� � ��������: ");
		String surname = sc.next();
		System.out.println(" �������� �������� � ������: ");
		String name = sc.next();
		boolean surnameFlag = false;
		boolean nameFlag = false;
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();
			if (next.surname.equalsIgnoreCase(surname)) {
				surnameFlag = true;
				if (next.name.equalsIgnoreCase(name)) {
					nameFlag = true;
					System.out.println("�������� �������� " + next);
					iterator.remove();
				}
			}
		}
		if (!surnameFlag) {
			System.out.println(" �������� � �������� �� ������ : " + surname + " �� ���� ");
		} else if (!nameFlag) {
			System.out.println(" �������� � �������� " + surname + " �� ������ : " + name + " �� ���� ");
		}
	}

	public void removeDeputy(String surname, String name) {

		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputy next = iterator.next();
			if (next.surname.equalsIgnoreCase(surname)) {

				if (next.name.equalsIgnoreCase(name)) {

					System.out.println("�������� �������� " + next);
					iterator.remove();
				}
			}
		}

	}

	public void showAllBriber() {
		Iterator<Deputy> iterator1 = fraction.iterator();
		System.out.println(" �������� ���������: ");
		int countBribe = 0;
		while (iterator1.hasNext()) {
			Deputy next = iterator1.next();
			if (next.isBribeTaker()) {
				countBribe++;
				System.out.println(next);
			}
		}
		if (countBribe == 0) {
			System.out.println(" ��������� � ������� ����");
		}

	}

	public void showMaxBriber() {
		Iterator<Deputy> iterator1 = fraction.iterator();
		System.out.println(" �������� �������� ���������: ");
		Deputy maxBribeDeputy = new Deputy(" ", " ", 0, false);

		while (iterator1.hasNext()) {
			Deputy next = iterator1.next();
			if ((next.isBribeTaker()) && (next.getBribe() > maxBribeDeputy.getBribe())) {
				maxBribeDeputy = next;
			}
		}
		if (maxBribeDeputy.isBribeTaker()) {
			System.out.println(maxBribeDeputy);
		} else {
			System.out.println(" ��������� � ������� ����");
		}
	}

	public void showAllDeputy() {
		Iterator<Deputy> iterator2 = fraction.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

	public void removeAllDeputy() {
		Iterator<Deputy> iterator3 = fraction.iterator();
		while (iterator3.hasNext()) {
			iterator3.next();
			iterator3.remove();
		}
		System.out.println(" ������� �������.");
	}

}
