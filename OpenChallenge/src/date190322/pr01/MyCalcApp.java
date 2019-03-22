package date190322.pr01;

public class MyCalcApp {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		int testX = 47;
		int testY = 23;
		
		System.out.println(testX + ", " + testY);
		System.out.println("add: " + myCalc.add(testX, testY));
		System.out.println("subtract: " + myCalc.subtract(testX, testY));
		System.out.println("multiply: " + myCalc.multiply(testX, testY));
	}
}
