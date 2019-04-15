package date190415;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex02MemberApp {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/Temp/addrInput.txt");
		BufferedReader br = new BufferedReader(fr);
		TreeSet<Ex02Member> memberSet = new TreeSet<Ex02Member>();
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			Ex02Member member = new Ex02Member();
			StringTokenizer st = new StringTokenizer(line, ",");
			member.setName(st.nextToken().trim());	// 공백 제거후 세터 호출
			member.setMail(st.nextToken().trim());
			member.setTel(st.nextToken().trim());
			memberSet.add(member);
		}
		System.out.println();
		for (Ex02Member member: memberSet)
			System.out.println(member);
		br.close();
		fr.close();
	}
}
