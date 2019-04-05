package sec03.exam01_priority;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		int j=0, k=0;
		for(int i=0; i<2000000000; i++) {
			j++; k++; j--; k--; j++; k++; j--; k--; j++; k++; j--; k--; j++; k++;
		}
		System.out.println(getName());
	}
}
