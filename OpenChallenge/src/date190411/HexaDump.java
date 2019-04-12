package date190411;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class HexaDump {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 파일명: ");
		String filePath = scan.nextLine();
		scan.close();
		
		byte buffer[] = new byte[16];		// Buffer size = 16
		int offset = 0, len = 0;
		InputStream is;
		BufferedInputStream bis;
		try {
			is = new FileInputStream(filePath);
			bis = new BufferedInputStream(is);
			while ((len = bis.read(buffer)) != -1) {
				System.out.printf("%08X  ", offset);
				showHexa(buffer, len);
				System.out.print(" ");
				showChar(buffer, len);
				offset += len;
			}
			bis.close(); 
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void showHexa(byte[] buf, int size) {
		for (int i=0; i<size; i++) {
			System.out.printf("%02X ", buf[i]);
			if (i==7) 
				System.out.print(" ");
		}
		if (size == 16)
			return;
		for (int i=size; i<16; i++) {
			System.out.print("   ");
			if (i==7) 
				System.out.print(" ");
		}
	}
	
	static void showChar(byte[] buf, int size) {
		for (int i=0; i<size; i++) {
			if (buf[i] >= 32 && buf[i] <= 126)
				System.out.print((char)buf[i]);
			else
				System.out.print(".");
			if (i==7) 
				System.out.print(" ");
		}
		System.out.println();
	}
}
