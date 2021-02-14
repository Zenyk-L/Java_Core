package ua.lviv.lgs.task3;

import java.util.Arrays;

public class ArrayList {
	int l = 10;
	Object[] array = new Object[10];

	public ArrayList() {
		array = new Object[10];
//		System.out.println(array.length);
	}

	public void add(Object o) {
		try {
			for (int i = 0; i < array.length + 1; i++) {
				if (array[i] == null) {
					this.array[i] = o;
//					System.out.println("array " + Arrays.toString(array));
					break;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			Object[] array1 = new Object[array.length];
			array1 = Arrays.copyOf(array, array.length);

			array = new Object[(int) (array1.length * 3 / 2 + 1)];
			array = Arrays.copyOf(array1, array.length);
			array[array1.length] = o;
//			System.out.println("array " + Arrays.toString(array));

		}
	}

	public void remove(int index) {
		Object arrayValue ;
		int arrayLenght = array.length;
		
		for (int i=0; i<array.length; i++) {
			if (array[i] == null) {
				arrayLenght = i+1;				
				break;
			};
		}

		if (index >= arrayLenght) {
			System.out.println("Element whith " + index + " dosn`t exist");
		} else {

			for (int i=index; i<arrayLenght; i++) {
				arrayValue = array[i] ; 
				array[i-1] = arrayValue;
				array[i] = null;
			}
		}
		if ((int)(((arrayLenght-1)*2)/3) <= 6) {
			array = Arrays.copyOf(array, 10);
		} else if  (((array.length - 1)*2) == ((arrayLenght)*3) ) {
			array = Arrays.copyOf(array, (int)(((array.length-1)*2)/3));
		}
//		System.out.println("array " + Arrays.toString(array));      // масив в процесі видалення
	}

	@Override
	public String toString() {
		return "ArrayList [l=" + l + ", array=" + Arrays.toString(array) + "]"; 
	}

}
