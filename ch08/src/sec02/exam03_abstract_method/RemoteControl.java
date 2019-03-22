package sec02.exam03_abstract_method;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	public abstract void setVolume(int volume);
}
