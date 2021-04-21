package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

public class ApplicationSave {
	public static void main(String[] args) throws IOException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
		File file = new File("Save.txt");
		Person person = new Person("Petro", "Ivanov", 25, 190, 100);
		
		System.out.println("Our person:");
		System.out.println(person);
		System.out.println();
		
		person.saveAnnotatedFields(file);
		
		person.getPersonFromFile(file);
		
		
		
	}
	
	

}
