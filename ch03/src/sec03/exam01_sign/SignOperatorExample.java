package sec03.exam01_sign;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);

		short s = 100;
		short result3 = (short)-s;  //컴파일 에러 
		int result4 = -s; 
		System.out.println("result4 = " + result4);
	}
}
