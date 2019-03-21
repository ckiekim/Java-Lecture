package date190321.pr02;

public class Member extends Customer {
	private String customerId;
	private int mileage;
	
	public Member(String customerId, int mileage, String name, String tel, String addr) {
		super();
		this.customerId = customerId;
		this.mileage = mileage;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Member [customerId=" + customerId + ", mileage=" + mileage + ", name=" + name + ", tel=" + tel
				+ ", addr=" + addr + "]";
	}
	
	public void show() {
		System.out.println(this.toString());
	}
}
