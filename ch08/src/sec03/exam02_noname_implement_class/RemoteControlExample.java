package sec03.exam02_noname_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {	// 익명 구현 객체
			public void turnOn() { 
				System.out.println("추상메소드 turnOn() 구현"); 
			}	
			public void turnOff() {
				System.out.println("추상메소드 turnOff() 구현");
			}
			public void setVolume(int volume) {
				System.out.println("추상메소드 setVolume(" + volume + ") 구현 ");
			}
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.turnOff();
	}
}