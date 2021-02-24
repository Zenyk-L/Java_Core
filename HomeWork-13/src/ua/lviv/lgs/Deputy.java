package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {
		String  surname;
		String name;
		int age;
		boolean bribeTaker;
		int bribe;
		
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
