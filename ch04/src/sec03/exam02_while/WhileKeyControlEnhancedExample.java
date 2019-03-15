package sec03.exam02_while;

public class  WhileKeyControlEnhancedExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("----------------------------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지 | 4.급가속 | 5.급감속");
				System.out.println("----------------------------------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			if (keyCode == '1') {
				speed++;				
			} else if (keyCode == '2') { 
				speed--;
				if (speed < 0)
					speed = 0;
			} else if (keyCode == '3') {
				break;
			} else if (keyCode == '4') {
				speed += 10;
			} else if (keyCode == '5') {
				speed -= 10;
				if (speed < 0)
					speed = 0;
			}
			System.out.println("현재 속도=" + speed);
		}	
		System.out.println("프로그램 종료");
	}
}
