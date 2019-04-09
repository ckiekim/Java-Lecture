package sec03.exam01_hashset;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public String tel;
	
	public Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name);
			//return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return Objects.hash(tel);
		//return name.hashCode() + age;
	}
}
