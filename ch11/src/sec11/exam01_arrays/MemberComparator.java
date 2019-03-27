package sec11.exam01_arrays;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member3> {
	@Override
	public int compare(Member3 o1, Member3 o2) {
		return o2.name.compareTo(o1.name);
	}
}
