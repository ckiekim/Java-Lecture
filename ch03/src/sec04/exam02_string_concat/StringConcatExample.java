package sec04.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 8.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 5.0;
		String str4 = 3 + 5.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}
}
