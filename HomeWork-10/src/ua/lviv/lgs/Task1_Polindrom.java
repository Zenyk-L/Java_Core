package ua.lviv.lgs;

import java.util.Scanner;

public class Task1_Polindrom {
	public static void main(String[] args) {

		while (true) {
			System.out.println("������ ����� � 5 ����: ");
			Scanner sc = new Scanner(System.in);

			String word1 = sc.next();
			StringBuffer word2 = new StringBuffer(word1.toLowerCase());
			word2.reverse();

			if (word1.length() > 5) {
				System.out.println("�� ����� ����� ����� �� � 5 ����");
			} else if (word1.length() < 5) {
				System.out.println("�� ����� ����� ����� �� � 5 ����");
			} else if (word1.length() == 5) {
				if (word1.toLowerCase().equals(word2.toString())) {
					System.out.println("������� ���� ����� ��������:  " + word1);					
				}else {
					System.out.println("������� ���� ����� �� ��������:  " + word1);
				}
			}
		}
	}

}
