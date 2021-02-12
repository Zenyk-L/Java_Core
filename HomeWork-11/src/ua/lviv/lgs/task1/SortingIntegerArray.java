package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SortingIntegerArray {
	public static void main(String[] args) {
		
		Random r = new Random();				
		Integer [] integer = new Integer[r.nextInt(50)];
		
		for (int i = 0; i < integer.length; i++) {
			Arrays.fill(integer,i,i+1,r.nextInt(100));
		}
		System.out.println("Array of integers:");
		System.out.println(Arrays.toString(integer));
		
		Arrays.sort(integer);
		System.out.println("Array of integers sorted asc:");
		System.out.println(Arrays.toString(integer));
		
		Arrays.sort(integer, Collections.reverseOrder());
		System.out.println("Array of integers sorted desc:");
		System.out.println(Arrays.toString(integer));
		
		
	}

}
