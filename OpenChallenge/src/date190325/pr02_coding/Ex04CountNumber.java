package date190325.pr02_coding;

import java.util.Arrays;

public class Ex04CountNumber {
	public static void main(String[] args) {
		int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		for (int i=1; i<=9; i++) {
			counts[i]++;
		}
		for (int i=10; i<=99; i++) {
			int firstDigit = i / 10;
			int secondDigit = i % 10;
			counts[firstDigit]++; counts[secondDigit]++;
		}
		for (int i=100; i<=999; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			counts[firstDigit]++; counts[secondDigit]++; counts[thirdDigit]++;
		}
/*		for (int i=1000; i<=9999; i++) {
			int first = i / 1000;
			int second = (i / 100) % 10;
			int third = (i / 10) % 10;
			int fourth = i % 10;
			counts[first]++; counts[second]++; counts[third]++; counts[fourth]++;
		}*/
		counts[1]++; counts[0] += 3; 	// 1000
		
		System.out.println(Arrays.toString(counts));
	}
}
