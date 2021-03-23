package ua.lviv.lgs;

import ua.lviv.lgs.Collection.StaticClass;

public class Aplication {

	public static void main(String[] args) {

		Number[] numberArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};

		System.out.println("Oryginal: ");
		for (Number number : numberArray) {
			System.out.print(number + ", ");
		}
		Collection col = new Collection(numberArray);
		System.out.println();

		System.out.println("Each Third : ");
		Iterator iteratorEachThird = col.eachThird();
		while (iteratorEachThird.hasNext()) {
			Number next = iteratorEachThird.next();
			if (next.doubleValue() % 2 == 1) {
				System.out.print(next + ", ");
			}
		}

		System.out.println();
		
		col.isPair();
		
		System.out.println();

		System.out.println("Backward: ");

		Iterator iteratorBackward = col.createBackward();
		while (iteratorBackward.hasNext()) {
			System.out.print(iteratorBackward.next() + ", ");
		}

		System.out.println();
		System.out.println("Forward: ");
		Iterator iteratorForward = col.createForward();
		while (iteratorForward.hasNext()) {
			System.out.print(iteratorForward.next() + ", ");
		}
		

		col.PairChangeToOdd();

	}
}
