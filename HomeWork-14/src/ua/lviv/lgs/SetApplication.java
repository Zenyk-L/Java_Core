package ua.lviv.lgs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApplication {
	public static void main(String[] args) {
		
		Set<Student> students = new HashSet<>();		

		TreeSet<Student> students1 = new TreeSet<>();
		
		TreeSet<Student> students2 = new TreeSet<>(new SortByDesc());
		

		students.add(new Student("One", 5));
		students.add(new Student("Two", 4));
		students.add(new Student("Tree", 3));
		students.add(new Student("Tree", 4));
		students.add(new Student("Four", 2));
		students.add(new Student("Five", 1));
		students.add(new Student("Six", 5));
		students.add(new Student("Six", 5));
		students.add(new Student("Six", 4));
		
		
		
		System.out.println("Oryginal: ");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		
		students1.addAll(students);
		
		System.out.println("ASC sort by Comparable");
		for (Student student : students1) {
			System.out.println(student);
		}
		System.out.println();		
		
		students2.addAll(students);
		
		System.out.println("DESC sort by Comparator");
		for (Student student : students2) {
			System.out.println(student);
		}
	}
}

class SortByDesc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if ((o1.getName().compareTo(o2.getName())) < 0) {
			return 1;
		} else if ((o1.getName().compareTo(o2.getName())) > 0) {
			return -1;
		} else {
			if (o1.getLevel() > o2.getLevel()) {
				return -1;
			} else if (o1.getLevel() < o2.getLevel()) {
				return 1;
			}
		}
		return 0;
	}
}
