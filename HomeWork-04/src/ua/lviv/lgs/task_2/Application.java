package ua.lviv.lgs.task_2;

public class Application {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		System.out.println(a);
		System.out.println("------------------------------------------------------------------------");
		
		a.setName("ม่๊");
		a.setSpeed(2);
		a.setAge(14);
		
		System.out.println(a);
	}
}
