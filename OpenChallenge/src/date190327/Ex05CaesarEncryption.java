package date190327;
import java.util.Scanner;

public class Ex05CaesarEncryption {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열과 숫자 입력: ");
		String str = scan.nextLine();
		String[] tmp = str.split(" ");
		int number = Integer.parseInt(tmp[1]);
		str = makeCaesarEncryption(tmp[0], number);
		System.out.println(str);
		scan.close();
	}
	
	static String makeCaesarEncryption(String str, int number) {
		byte[] plain = str.getBytes();
		byte[] crypt = new byte[str.length()];
		for (int i=0; i<str.length(); i++) {
			if (plain[i] + number <= 90) 
				crypt[i] = (byte)(plain[i] + number);
			else
				crypt[i] = (byte)(plain[i] + number - 26);
		}
		return new String(crypt);
	}
}
