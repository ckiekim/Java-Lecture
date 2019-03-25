package date190325.pr01_exception;
import java.util.Scanner;

public class LoginApp {
	static String[] loginIds = {"abcde", "fghij", "klmno", "pqrst", "uvwxyz"};
	static String[] passwords = {"abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12"};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Login ID: ");
		String loginId = scan.nextLine();
		System.out.print("Password: ");
		String password = scan.nextLine();
		scan.close();
		
		try {
			if (checkLoginPassword(loginId, password))
				System.out.println("로그인 성공");
		} catch (InvalidLoginIdException | IncorrectPasswordException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static boolean checkLoginPassword(String loginId, String password)
			throws InvalidLoginIdException, IncorrectPasswordException {
		int index = -1;
		for (int i=0; i<loginIds.length; i++) {
			if (loginIds[i].equals(loginId)) {
				index = i;
				break;
			}
		}
		if (index < 0)
			throw new InvalidLoginIdException("로그인 아이디가 없습니다.");
		if (passwords[index].equals(password))
			return true;
		else
			throw new IncorrectPasswordException("패스워드를 잘못 입력하였습니다.");
	}
}
