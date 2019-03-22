package date190322.pr03;

import java.util.Arrays;

public class MySortApp {
	public static void main(String[] args) {
		String[] givenStr = {"자바", "객체", "상속", "인터페이스", "다형성"};

		MySortImpl mySort = new MySortImpl();
		System.out.println(Arrays.toString(mySort.sort(givenStr)));
		System.out.println(Arrays.toString(givenStr));
		System.out.println(Arrays.toString(mySort.sort(givenStr, true)));
		System.out.println(Arrays.toString(givenStr));
		System.out.println(Arrays.toString(mySort.sort(givenStr, false)));
		System.out.println(Arrays.toString(givenStr));
	}
}
