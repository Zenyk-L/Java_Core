package ua.lviv.lgs;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {

		String s = new String(
				"one two one two three two one two three four one two three five one two three six one two three seven one three veight one nine one ten one two two two two two ");

		s.toLowerCase();

		String[] words = s.split(" ");
		int[] count = new int[words.length];
		for (int c : count) {
			c = 0;
		}

		System.out.println(Arrays.toString(words));

		for (int i = 0; i < words.length; i++) {
			int pos = -3;
			do {
				pos = s.indexOf(words[i], words[i].length() + pos);
				if (pos > -1) {
					count[i]++;
				}
			} while (pos > -1);
		}
		System.out.println(Arrays.toString(count));
		int max = 0;
		for (int i = 0; i < words.length - 1; i++) {
			if (count[i] < count[i + 1]) {
				max = i + 1;
			}
		}
		System.out.println("Найчастише зустрічається слово: " + words[max]);
	}

}
