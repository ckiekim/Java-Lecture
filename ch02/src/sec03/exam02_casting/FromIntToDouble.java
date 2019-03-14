package sec03.exam02_casting;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;

		double num3 = num2;
		num2 = (int) num3;
		
		System.out.println(num1 + ", " + num2);
	}
}
