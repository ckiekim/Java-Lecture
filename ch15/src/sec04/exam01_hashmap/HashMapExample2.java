package sec04.exam01_hashmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Student s = new Student(20011234, "홍길동");
		
		map.put(new Student(20011234, "홍길동"), 95);
		System.out.println("Value = " + map.get(s));
		map.put(s, 90);
		
		System.out.println("총 Entry 수: " + map.size());
		System.out.println("Value = " + map.get(s));
	}
}
