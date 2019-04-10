package date190408;

public class Ex02Member implements Comparable<Ex02Member> {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Ex02Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Ex02Member m) {
		if (this.age > m.age)
			return 1;
		if (this.age < m.age)
			return -1;
		return 0;
	}
}
