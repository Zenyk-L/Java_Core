package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
		
		Su_27 s = new Su_27(15, 5, 100, 100, "Silver");
		
		System.out.println(s);
		System.out.println("=========================================================");
		s.engineStart();
		s.depature();
		s.up();
		s.left();
		s.down();
		s.right();
		s.unvisible();
		s.strike();
		s.speed();
		s.arrive();
		
		
		
		
	}

}
