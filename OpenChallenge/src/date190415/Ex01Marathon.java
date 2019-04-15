package date190415;

import java.util.ArrayList;
import java.util.List;

public class Ex01Marathon {

	public static void main(String[] args) {
		String persons[] = {"이유덕","이재영","권종표","이재영","박민호"};
		String persons2[] = {"이유덕","이재영","권종표","이재영"};
		String persons3[] = {"이유덕","이재영","권종표","박민호"};
		List<String> participants = new ArrayList<String>();
		List<String> completioners = new ArrayList<String>();
		for(String person: persons)
			participants.add(person);
		for(String person: persons2)
			completioners.add(person);
		System.out.println(findPerson(participants, completioners));
	}

	static String findPerson(List<String> participants, List<String> completioners) {
		for(String person: completioners) {
			if (!participants.remove(person))
				System.out.println("리스트에서 엘리먼트 제거에 문제가 발생");;
		}
		return participants.get(0);
	}
}
