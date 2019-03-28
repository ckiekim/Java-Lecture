package date190327;
import java.util.Scanner;

public class Ex04SumOfSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		while(true) {
			System.out.print("양의 정수 입력: ");
			number = Integer.parseInt(scan.nextLine());
			if (number > 0)
				break;
		}
		scan.close();
		
		int sumOfSquare = 0, squareOfSum = 0;
		for (int i=1; i<=number; i++) {
			sumOfSquare += i * i;
			squareOfSum += i;
		}
		squareOfSum *= squareOfSum;
		System.out.println("1에서 " + number + "까지");
		System.out.println("합의 제곱 = " + squareOfSum);
		System.out.println("제곱의 합 = " + sumOfSquare);
		System.out.println("차이 = " + (squareOfSum - sumOfSquare));
	}
}
