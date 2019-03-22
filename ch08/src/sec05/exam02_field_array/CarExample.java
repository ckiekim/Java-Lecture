package sec05.exam02_field_array;
import sec05.exam01_field_polymorphism.*;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("-------------------------------");
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}
}
