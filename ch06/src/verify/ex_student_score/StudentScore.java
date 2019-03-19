package verify.ex_student_score;

public class StudentScore {
	String name;
	int math;
	int eng;
	int sci;
	double avg;
	
	public StudentScore(String name, int math, int eng, int sci) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}

	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", eng=" + eng + ", sci=" + sci + ", avg=" + avg + "]";
	}
	
	double average() {
		int sum = this.math + this.eng + this.sci;
		double avg = (double)sum / 3;
		this.avg = avg;
		return avg;
	}
}
