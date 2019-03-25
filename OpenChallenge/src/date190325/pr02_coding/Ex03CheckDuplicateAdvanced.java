package date190325.pr02_coding;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex03CheckDuplicateAdvanced {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = new String[10];
		boolean[] results = new boolean[10];
		
		System.out.print("숫자 입력: ");
		String line = scan.nextLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int count = st.countTokens();
		if (count > 10)
			count = 10;
		for (int i=0; i<count; i++) {
			String str = st.nextToken();
			numbers[i] = str;
			if (i != 0) {
				boolean found = false;
				for (int k=0; k<i; k++) {
					if (str.equals(numbers[k])) {
						found = true;
						break;
					}
				}
				results[i] = found ? false : true;
			} else {
				results[0] = true;
			}
		}
		String[] numbersCopy = Arrays.copyOf(numbers, count);
		boolean[] resultsCopy = Arrays.copyOf(results, count);
		
		System.out.println(Arrays.toString(numbersCopy));
		System.out.println(Arrays.toString(resultsCopy));
	}
}
