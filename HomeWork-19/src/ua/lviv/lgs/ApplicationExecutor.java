package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationExecutor {
	public static Object lock = new Object();

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("Test.txt");
		Employee emp = new Employee("Peter", 11, 25.5);


		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new Serialize(file, emp));
		executor.submit(new Deselialize(file));



		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(new Employee("Stepan", 15, 30.5));
		list.add(new Employee("Ivan", 20, 45.5));

		File file2 = new File("Test2.txt");
		System.out.println();

		executor.submit(new Serialize(file2, list));
		executor.submit(new Deselialize(file2));
		executor.shutdown();
		
	}
}

class Serialize implements Runnable {
	File file;
	Object object;

	public Serialize(File file, Object object) {
		super();
		this.file = file;
		this.object = object;
	}

	@Override
	public synchronized void run() {
		synchronized (ApplicationExecutor.lock) {
			try {
				Methods.serialize(file, object);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}

class Deselialize implements Runnable {

	File file;

	public Deselialize(File file) {
		super();
		this.file = file;
	}

	@Override
	public void run() {
		synchronized (ApplicationExecutor.lock) {
			try {
				Methods.deserealize(file);
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}

		}
	}

}