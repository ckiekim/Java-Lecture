package sec07.exam01_constructor_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("검정", 3000);
		Car myCar2 = new Car();  //(x)
		Car myCar3 = new Car("검정");
	}
}
