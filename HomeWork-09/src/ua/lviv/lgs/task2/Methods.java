package ua.lviv.lgs.task2;

public class Methods {
	int a, b;

	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		conditionChek(this.a, this.b);
	}

	public void conditionChek(int a, int b) {
		try {
			if ((a < 0) & (b < 0)) {
				throw new IllegalArgumentException();
			} else if (((a == 0) & (b != 0)) | ((a != 0) & (b == 0))) {
				throw new ArithmeticException();
			} else if ((a == 0) & (b == 0)) {
				throw new IllegalAccessException();
			} else if ((a > 0) & (b > 0)) {
				throw new MyException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Числа " + a + " < 0 та " + b + " < 0 ");
		} catch (ArithmeticException e) {
			System.out.println("Число " + a + " або " + b + " = 0 ");
		} catch (IllegalAccessException e) {
			System.out.println("Числа " + a + " та " + b + " = 0 ");
		} catch (MyException e) {
			System.out.println("Числа " + a + " > 0 та " + b + " > 0 ");
		}
	}
	
	public void methods(int a, int b) {		
		this.a = a;
		this.b = b;
		conditionChek(this.a, this.b);
	}

	public void plus() {
		System.out.println(this.a + " + " + this.b + " = " + (this.a + this.b));
	}

	public void minus() {
		System.out.println(this.a + " - " + this.b + " = " + (this.a - this.b));
	}

	public void multiply() {
		System.out.println(this.a + " x " + this.b + " = " + (this.a * this.b));
	}

	public void divide() {
		try {
			System.out.println(this.a + " / " + this.b + " = " + (this.a / this.b));
		} catch (ArithmeticException e) {
			System.out.println(" На 0 ділити не можна ");
		}
	}

}
