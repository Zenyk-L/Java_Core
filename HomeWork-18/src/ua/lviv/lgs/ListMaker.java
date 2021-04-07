package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class ListMaker<T> {

	public static <T> List<T> addItem(List<T> list, Object value) {
		list.add((T) value);
		return list;
	}

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		addItem(intList, "one");
		addItem(intList, "two");
		addItem(intList, "three");
		System.out.print("List<Integer> = ");
		System.out.println(intList);
	}
}
