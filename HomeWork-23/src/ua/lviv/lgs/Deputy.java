package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {
		String  surname;
		String name;
		int age;
		boolean bribeTaker;
		int bribe;
		Scanner sc = new Scanner(System.in);
		
//		public Deputy() {
//			System.out.println(" Введіть прізвище ");
//			String surname = sc.next();
//			System.out.println(" Введіть імя ");
//			String name = sc.next();
//			System.out.println(" Введіть вік ");
//			int age = sc.nextInt();
//			System.out.println("Даний депутат: хабарник - введіть  1, не бере хабарі - введіть 0");
//			int inputBribe = sc.nextInt();
//			boolean bribeTaker;
//
//			while ((inputBribe != 0) & (inputBribe != 1)) {
//				System.out.println("Даного пункту меню не існує:");
//				System.out.println("Даний депутат: хабарник - введіть  1, не бере хабарі - введіть 0");
//				inputBribe = sc.nextInt();
//			}
//
//			if (inputBribe == 0) {
//				bribeTaker = false;
//			} else {
//				bribeTaker = true;
//			}
//
//			this.surname = surname;
//			this.name = name;
//			this.age = age;
//			this.bribeTaker = bribeTaker;
//		}
		
		public Deputy(String surname, String name, int age, boolean bribeTaker) {
			super();
			this.surname = surname;
			this.name = name;
			this.age = age;
			this.bribeTaker = bribeTaker;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isBribeTaker() {
			return bribeTaker;
		}

		public void setBribeTaker(boolean bribeTaker) {
			this.bribeTaker = bribeTaker;
		}

		public int getBribe() {
			return bribe;
		}

		public void setBribe(int bribe) {
			this.bribe = bribe;
		}

		@Override
		public String toString() {
			return "\n Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
					+ ", bribe=" + bribe + "]";
		}
		
		public void giveBribe() {
			if (this.bribeTaker == false) {
				System.out.println(" Цей депутат не бере хабарів ");
			} else {
				System.out.println(" Введіть суму хабаря: ");
				Scanner sc = new Scanner(System.in);
				int bribeSumm = sc.nextInt();
				if (bribeSumm > 5000) {
					System.out.println(" Поліція ув`язнить депутата ");
				} else {
					this.bribe += bribeSumm;
				}
			}
		}
		
		
		
		
	
	

}
