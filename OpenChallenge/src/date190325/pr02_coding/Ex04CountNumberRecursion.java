package date190325.pr02_coding;

public class Ex04CountNumberRecursion {
	public static void main(String[] args) {
		System.out.println("8! = " + factorial(8));
		for (int i=1; i<21; i++)
			System.out.println(i + ": " + fibonacci(i));
	}
	
	static int factorial(int n) {
		if (n == 0)
			return 1;
		return n*factorial(n-1);
	}
	
	static int fibonacci(int n) {
		if (n == 1 | n == 2)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
