package date190410;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex02TreeSet {
	public static void main(String[] args) {
		String inputData = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		StringTokenizer st = new StringTokenizer(inputData, ",");
		
		TreeSet<String> nameSet = new TreeSet<String>();
		int countKim = 0; int countLee = 0; int countLJY = 0;
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			if (name.charAt(0) == '김')
				countKim++;
			if (name.charAt(0) == '이')
				countLee++;
			if (name.equals("이재영"))
				countLJY++;
			nameSet.add(name);
		}
		System.out.println("1. 중복을 포함하여 성이 김씨인 사람: " + countKim);
		System.out.println("   중복을 포함하여 성이 이씨인 사람: " + countLee);
		System.out.println("2. 중복을 포함하여 이름이 이재영인 사람: " + countLJY);
		System.out.println("3,4. 중복을 제거하고 오름차순으로 정렬한 후 명단");
		for (String name : nameSet)
			System.out.print(name + ", ");
	}
}
