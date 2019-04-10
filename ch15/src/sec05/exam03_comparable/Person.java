package sec05.exam03_comparable;

import java.util.Objects;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(age < o.age) 
			return -1;
		else if(age > o.age) 
			return 1;
		else 
			return name.compareTo(o.name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return (age==p.age) && (name.equals(p.name)) ;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
