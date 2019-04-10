package date190410;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex01Array {
	public static void main(String args[]) {
		String inputData = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		StringTokenizer st = new StringTokenizer(inputData, ",");
		int len = st.countTokens();
		String names[] = new String[len];
		
		int countKim = 0; int countLee = 0; int countLJY = 0;
		for (int i=0; i<len; i++) {
			names[i] = st.nextToken();
			if (names[i].charAt(0) == '김')
				countKim++;
			if (names[i].charAt(0) == '이')
				countLee++;
			if (names[i].equals("이재영"))
				countLJY++;
		}
		System.out.println("1. 중복을 포함하여 성이 김씨인 사람: " + countKim);
		System.out.println("   중복을 포함하여 성이 이씨인 사람: " + countLee);
		System.out.println("2. 중복을 포함하여 이름이 이재영인 사람: " + countLJY);
		
		System.out.println("3. 중복을 제거한 후 명단");
		String uniqueNames[] = new String[countDistinctNames(names)];
		int index = 0;
		for (int i=0; i<len; i++) {
			if (names[i] != null)
				uniqueNames[index++] = names[i];
		}
		System.out.println(Arrays.toString(uniqueNames));
		System.out.println("4. 오름차순으로 정렬한 후 명단");
		sortNames(uniqueNames);
		System.out.println(Arrays.toString(uniqueNames));
	}
	
	static void sortNames(String names[]) {
		int len = names.length;
		String[] sorted = new String[len];
		
		for (int i=0; i<len-1; i++) {
			for (int k=i+1; k<len; k++) {
				if (names[i].compareTo(names[k]) > 0) {
					String s = names[i];
					names[i] = names[k];
					names[k] = s;
				}
			}
		}
	}
	
	static int countDistinctNames(String names[]) {
		int count = 1;
		for (int i=1; i<names.length; i++) {
			for (int k=0; k<i; k++) {
				if (names[i].equals(names[k])) {
					names[i] = null;
					break;
				}
			}
			if (names[i] != null)
				count++;
		}
		return count;
	}
}
