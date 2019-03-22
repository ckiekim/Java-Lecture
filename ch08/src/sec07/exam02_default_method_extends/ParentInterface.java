package sec07.exam02_default_method_extends;

public interface ParentInterface {
    public abstract void method1();
    
    public default void method2() {
    	System.out.println("ParentInterface의 default method2()");
    }
}