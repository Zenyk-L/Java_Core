package ua.lviv.lgs;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("Test.txt");		
		Employee emp = new Employee("Peter", 11, 25.5);
		
		Methods.serialize(file, emp);
		
		Methods.deserealize(file);
		
		
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(new Employee("Stepan", 15, 30.5));
		list.add(new Employee("Ivan", 20, 45.5));
		
		
		File file2 = new File("Test2.txt");
		System.out.println();
		Methods.serialize(file2, list);
		
		Methods.deserealize(file2);
		
	}

}
