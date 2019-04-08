package date190408;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex03Time {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("현재 시각(hh:mm:ss)> ");
		String currentTime = scan.nextLine();
		int hour = Integer.parseInt(currentTime.substring(0, 2));
		int min = Integer.parseInt(currentTime.substring(3, 5));
		int sec = Integer.parseInt(currentTime.substring(6));
		int now = hour * 60 * 60 + min * 60 + sec;
		
		System.out.println("퇴근 시간 = 18:30:00");
		int off = 18 * 60 * 60 + 30 * 60;
		int remain = off - now;
		sec = remain % 60;
		remain /= 60;
		min = remain % 60;
		hour = remain / 60;
		System.out.println("퇴근까지 남은 시간 = " + hour + ":" + min + ":" + sec);
	}

/*	static String remainTime(String time) {
		LocalTime currentTime;
		LocalTime offWorkTime = LocalTime.of(18, 30, 0, 0);
		if (time == null) {
			currentTime = LocalTime.now();
		} else {
			int hour = Integer.parseInt(time.substring(0, 2));
			int min = Integer.parseInt(time.substring(3, 5));
			int sec = Integer.parseInt(time.substring(6));
			currentTime = LocalTime.of(hour, min, sec, 0);
		}
		return "s";
	}*/
}
