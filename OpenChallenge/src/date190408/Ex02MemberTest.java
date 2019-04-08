package date190408;

public class Ex02MemberTest {
	public static void main(String[] args) {
		Ex02Member m1 = new Ex02Member("김자바", "javakim", "javakim", 29);
		Ex02Member m2 = new Ex02Member("박인터", "interpark", "javakim", 21);
		Ex02Member m3 = new Ex02Member("이디비", "dblee", "javakim", 31);
		Ex02Member m4 = new Ex02Member("한마이", "myhan", "javakim", 29);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m1.compareTo(m4));
	}
}
