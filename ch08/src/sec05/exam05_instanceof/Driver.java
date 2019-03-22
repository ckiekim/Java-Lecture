package sec05.exam05_instanceof;
import sec05.exam03_method_polymorphism.*;
import sec05.exam04_casting.Bus;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}