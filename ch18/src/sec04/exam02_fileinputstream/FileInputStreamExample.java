package sec04.exam02_fileinputstream;
import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			File file = new File("F:/Workspace/EGov/Java/ch18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
			FileInputStream fis = new FileInputStream(file);
			//FileInputStream fis = new FileInputStream("F:/Workspace/EGov/Java/ch18/src/sec04/exam02_fileinputstream/FileInputStreamExample.java");
			int data;
			while ( (data = fis.read() ) != -1 ) {
				System.out.write(data);
			}
			fis.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
