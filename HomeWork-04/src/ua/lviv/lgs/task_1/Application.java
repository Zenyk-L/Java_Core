package ua.lviv.lgs.task_1;

public class Application {
	public static void main(String[] args) {
		
		Robot R = new Robot();
		CoffeRobot C = new CoffeRobot();
		RobotDancer D = new RobotDancer();
		RobotCoocker Co = new RobotCoocker();
		
		
		R.work();
		C.work();
		D.work();
		Co.work();
		
		System.out.println("=======================================");
		
		Robot[] RA = {R, C, D, Co};
		
		for (int i = 0; i < RA.length; i++) {
		RA[i].work();
		}
	}

}
