package sec04.exam01_arithmetic;

public class OverflowExample {
	public static void main(String[] args) {
		/*
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		*/

		long lx = 1000000L;
		int y = 1000000;
		long lz = lx * y;
		System.out.println(lz);
	}
}

