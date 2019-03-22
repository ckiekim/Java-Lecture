package date190322.pr02;

import java.util.Arrays;

public class MyMultiApp {
	public static void main(String[] args) {
		int[] givenArray = {54, 23, 46, 89, 29, 40, 91, 7, 89, 11};
		MyMultiImpl myMulti = new MyMultiImpl();
		
		System.out.println(Arrays.toString(givenArray));
		System.out.println("Max: " + myMulti.max(givenArray));
		System.out.println("Min: " + myMulti.min(givenArray));
		System.out.println("Sum: " + myMulti.sum(givenArray));
		System.out.println("Avg: " + myMulti.avg(givenArray));
	}
}
