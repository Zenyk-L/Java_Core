package ua.lviv.lgs;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		
		String sb = new String("We will count the words in this sentence.");
		
		String[] words = sb.split(" ");		

		System.out.println(sb);		
		
		System.out.println("In sentence " + words.length + " words.");
		
		
	}

}
