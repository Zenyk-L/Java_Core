package ua.lviv.lgs.task1;

public class WorkerHour implements Salary{
	
	int hour = 180;
	
	public void paySalary () {
		System.out.println("Працівник з погодинною оплатою за " + hour + " годин в місяць отримує " + (hour * 35) + " грн/міс");
	}

}
