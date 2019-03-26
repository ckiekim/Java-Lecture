package date190325.pr02_coding;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 입력을 한 줄에 여러개(갯수 제한 없음) 받아서 처리
public class Ex03CheckDuplicateAdvanced {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String line = scan.nextLine();
		scan.close();
		
		StringTokenizer st = new StringTokenizer(line, " ");
		int count = st.countTokens();
		String[] numbers = new String[count];
		boolean[] results = new boolean[count];

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
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(results));
	}
}
