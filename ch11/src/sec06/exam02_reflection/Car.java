package sec06.exam02_reflection;

public class Car {
	private String model;
	public String owner;
	
	public Car() {
	}
	
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	private void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
 }
