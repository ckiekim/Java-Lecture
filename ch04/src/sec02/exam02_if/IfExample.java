package sec02.exam02_if;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score>=90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
		System.out.println("공통 사항입니다.");
	}
}
