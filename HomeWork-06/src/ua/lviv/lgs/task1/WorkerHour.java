package ua.lviv.lgs.task1;

public class WorkerHour implements Salary{
	
	int hour = 180;
	
	public void paySalary () {
		System.out.println("��������� � ���������� ������� �� " + hour + " ����� � ����� ������ " + (hour * 35) + " ���/��");
	}

}
