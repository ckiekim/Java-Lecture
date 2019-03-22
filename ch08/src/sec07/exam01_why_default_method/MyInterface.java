package sec07.exam01_why_default_method;

public interface MyInterface {
	public abstract void method1();
	
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}