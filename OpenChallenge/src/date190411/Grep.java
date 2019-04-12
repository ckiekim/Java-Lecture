package date190411;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Grep {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 문자열: ");
		String word = scan.nextLine();
		System.out.print("찾을 파일명: ");
		String filePath = scan.nextLine();
		System.out.print("대소문자 무시? (Y/n) ");
		String option = scan.nextLine();
		scan.close();
		int lineNo = 0;
		boolean ignoreCase = false;
		if (option != null && (option.equals("Y") || option.equals("y")))
			ignoreCase = true;
		
		FileReader fr = null; 
		BufferedReader br = null;
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			String rowData;
			while( (rowData=br.readLine())!= null ) {
				lineNo++;
				String lineData;
				if (ignoreCase) {
					word = word.toLowerCase();
					lineData = rowData.toLowerCase();
				} else {
					lineData = rowData;
				}
				if (lineData.indexOf(word) >= 0)
					System.out.println(lineNo + ": " + rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close(); fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			} 
		}
	}
}
