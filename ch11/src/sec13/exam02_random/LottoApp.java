package sec13.exam02_random;
import java.util.Arrays;
import java.util.Random;

public class LottoApp {
	public static void main(String[] args) {
		//당첨번호
		int[] winningNumber = new int[6];
		Random random = new Random(5);
		System.out.print("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
		}
		Arrays.sort(winningNumber);
		System.out.println(Arrays.toString(winningNumber));
		
		int[] selectNumber = new int[6];
		for (int i=0; i<10000000; i++) {
			random = new Random();
			//System.out.print("선택 번호: ");
			for(int k=0; k<6; k++) {
				selectNumber[k] = random.nextInt(45) + 1;
			}
			Arrays.sort(selectNumber);
			if (Arrays.equals(selectNumber, winningNumber)) {
				System.out.println(i);
				System.out.println("1등에 당첨되셨습니다.");
				System.out.println(Arrays.toString(winningNumber));
				break;
			}
		}
		System.out.println("End");
	}
}
