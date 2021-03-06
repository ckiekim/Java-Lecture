package sec02.exam04_default_method;
public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트 메소드
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}