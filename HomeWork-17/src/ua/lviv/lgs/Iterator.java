package ua.lviv.lgs;

public interface Iterator {
	public boolean hasNext();

	public Number next();
}

class Collection {
	private static Number[] arr;

	Collection(Number[] arr) {
		Collection.arr = arr;
	}

	public class Forward implements Iterator {
		int count = -1;

		@Override
		public boolean hasNext() {

			return count < arr.length - 1;
		}

		@Override
		public Number next() {
			count++;
			if (count % 2 == 1) {
				arr[count] = 0;
			}
			return arr[count];
		}

	}

	public Forward createForward() {
		return new Forward();
	}

	public class Backward implements Iterator {
		int count = arr.length + 1;

		@Override
		public boolean hasNext() {

			return count > 1;
		}

		@Override
		public Number next() {
			return arr[count -= 2];
		}

	}

	public Backward createBackward() {
		return new Backward();
	}

	public Iterator eachThird() {
		return new Iterator() {
			int count = arr.length + 2;

			@Override
			public boolean hasNext() {

				return count > 2;
			}

			@Override
			public Number next() {
				return arr[count -= 3];
			}

		};
	}

	public void isPair() {

		class EachFifth implements Iterator {
			int count = -5;

			@Override
			public boolean hasNext() {
				return count < arr.length - 5;
			}

			@Override
			public Number next() {
				return arr[count += 5];
			}
		}
		System.out.println("EachFifth");
		Iterator pair = new EachFifth();
		while (pair.hasNext()) {
			Number next = pair.next();
			if (next.doubleValue() % 2 == 0) {
				Double nextPair = next.doubleValue() -  100;
				System.out.print(nextPair + ", ");
			} else {
				System.out.print(next + ", ");
			}
		}
	}
	
	public static class StaticClass implements Iterator{
		int count = -2;

		
		@Override
		public boolean hasNext() {
			return count < arr.length - 2;
		}

		@Override
		public Number next() {
			count+=2;
			if (arr[count].doubleValue() % 2 == 0) {
				arr[count] = arr[count].intValue()+1;
				System.out.print(arr[count] + ", ");
			} ;
			return arr[count];
		}
		
		
		
	}
	public static void PairChangeToOdd() {
		Iterator iterator1 = new StaticClass();
		System.out.println();
		System.out.println("Each Second Pair Change To Odd: ");
		while (iterator1.hasNext()) {
			iterator1.next();
		}
	}

}