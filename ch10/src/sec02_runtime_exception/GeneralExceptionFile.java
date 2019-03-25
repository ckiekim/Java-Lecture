package sec02_runtime_exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneralExceptionFile {
	public static void main(String args[]) {
		String path = "c:/Temp/test.txt";
		try {
			File file = new File(path) ;
			FileWriter fw = new FileWriter(file, true) ;
			fw.write("A quick brown fox");
			fw.flush();

			// 객체 닫기
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
