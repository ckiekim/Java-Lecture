package date190327;
import java.util.Scanner;

public class Ex03PerfectNumber {
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
		
		for (int i=2; i<=number; i++) {
			if (isPerfectNumber(i))
				System.out.print(i + " ");
		}
	}
	
	static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i=1; i<n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			return true;
		return false;
	}
}
