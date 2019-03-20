package sec10.exam01_static_member;

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		Calculator myCalc = new Calculator();
		int result4 = myCalc.plus(3, 4);	// 바람직하지 못한 방법
		System.out.println("result4 : " + result4);
		myCalc.setColor("Navy");
		System.out.println("color : " + myCalc.color);
	}
}
