package ua.lviv.lgs;

public class Task2 {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("We change a vowels letters to '-'");
		char[] vowels = { 'a', 'e', 'y', 'u', 'i', 'o', 'j' };

		System.out.println(s);
		
		for (int i = 0; i < s.length(); i++) {
			for (char c : vowels) {
				if (c == s.charAt(i)) {
					s.replace(i,i+1, "-");
				}
			}
		}
		
		System.out.println(s);
	}

}
