package ua.lviv.lgs.task2;

public class Application {
	public static void main(String[] args) {
		
		Methods m = new Methods(-1, -1);
		
		m.plus();
		m.minus();
		m.multiply();
		m.divide();
		
		m.methods(0,1);
		
		m.plus();
		m.minus();
		m.multiply();
		m.divide();
		
		m.methods(1,0);
		
		m.plus();
		m.minus();
		m.multiply();
		m.divide();
		
		m.methods(0,0);
		
		m.plus();
		m.minus();
		m.multiply();
		m.divide();
		
		m.methods(1,1);
		
		m.plus();
		m.minus();
		m.multiply();
		m.divide();
	}
}
