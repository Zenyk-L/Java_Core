package ua.lviv.lgs;

public class planeControl {
	
	void moveUp() {
		System.out.println("Летимо в верх "+ (int)(Math.random()*1000) + " м");
	}
	
	void moveDown() {
		System.out.println("Летимо в низ "+ (int)(Math.random()*1000)+ " м");
	}
	
	void moveLeft() {
		System.out.println("Летимо в ліво "+ (int)(Math.random()*1000)+ " м");
	}
	
	void moveRight() {
		System.out.println("Летимо в право "+ (int)(Math.random()*1000)+ " м");
	}

}
