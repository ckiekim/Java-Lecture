package date190327;

public class Ex01DigitMultiplication {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=10; i<=99; i++) {
			int firstDigit = i / 10;
			int secondDigit = i % 10;
			sum += firstDigit * secondDigit;
		}
		for (int i=100; i<=999; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			sum += firstDigit * secondDigit * thirdDigit;
		}
		System.out.println("10~1000까지 각 숫자를 분해하여 곱하기한 값의 전체 합 = " + sum);
	}
}
