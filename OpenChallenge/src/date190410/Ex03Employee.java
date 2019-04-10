package date190410;

import java.time.LocalDate;

public class Ex03Employee implements Comparable<Ex03Employee> {
	private int id;
	private String name;
	private String position;
	private LocalDate joinDate;
	
	public Ex03Employee(int id, String name, String position, LocalDate joinDate) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	public int getId() { return id; }
	public String getName() { return name; }
	public String getPosition() { return position; }
	public LocalDate getJoinDate() { return joinDate; }
	@Override
	public String toString() {
		return "Ex03Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}
	
	@Override
	public int compareTo(Ex03Employee o) {
		Ex03Position thisPos = Ex03Position.valueOf(position);
		Ex03Position oPos = Ex03Position.valueOf(o.getPosition());
		
		if (thisPos.compareTo(oPos) > 0) return 1;
		if (thisPos.compareTo(oPos) < 0) return -1;
		if (joinDate.compareTo(o.getJoinDate()) > 0) return 1;
		if (joinDate.compareTo(o.getJoinDate()) < 0) return -1;
		return name.compareTo(o.getName());
		
		/*if (thisPos.ordinal() < oPos.ordinal()) 
			return -1;
		else if (thisPos.ordinal() > oPos.ordinal()) 
			return 1;
		else {
			if (joinDate.isBefore(o.getJoinDate()))
				return -1;
			if (joinDate.isAfter(o.getJoinDate()))
				return 1;
			return 0;
		}*/
	}
}
