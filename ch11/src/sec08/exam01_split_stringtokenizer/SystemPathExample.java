package sec08.exam01_split_stringtokenizer;
import java.util.StringTokenizer;

public class SystemPathExample {
	public static void main(String[] args) {
		String path = System.getenv("PATH");
		StringTokenizer st = new StringTokenizer(path, ";");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
