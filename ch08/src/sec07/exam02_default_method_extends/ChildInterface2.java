package sec07.exam02_default_method_extends;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		System.out.println("ChildInterface2에서 재정의한 method2()");
	}
	
	public abstract void method3();
}