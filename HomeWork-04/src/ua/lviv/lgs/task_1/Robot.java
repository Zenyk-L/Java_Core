package ua.lviv.lgs.task_1;

public class Robot {
	
	private String message;
	
	Robot (){
		this.message = "Я Robot - я просто працюю";
	}
	
	public void work() {
		System.out.println(this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
