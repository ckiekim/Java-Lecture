package sec03.exam01_for;

public class EnhanceForExample {
	public static void main(String[] args) {
		String[] names = {"강진희", "권오인", "권종환", "김성현", "노연아",
							"백정호", "유상원", "은정우", "이아름", "정승아", 
							"정정화", "천세은", "홍민지"};
		
		for (String name : names) {		// Enhanced for-loop
			System.out.println(name);
		}
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
