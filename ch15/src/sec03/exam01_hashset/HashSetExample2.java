package sec03.exam01_hashset;
import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m1 = new Member("홍길동", 30, "010-2345-6789");
		Member m2 = new Member("홍길동", 40, "010-2345-6789");
		if (m1 == m2)
			System.out.println("== 성립");
		else
			System.out.println("== 불성립");
		
		set.add(m1);
		set.add(m2);
		
		System.out.println("총 객체수 : " + set.size());
	}
}
