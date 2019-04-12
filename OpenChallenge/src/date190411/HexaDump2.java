package date190411;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class HexaDump2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 파일명: ");
		String filePath = scan.nextLine();
		scan.close();
		
		byte buffer[] = new byte[1024];		// Buffer size = 1024
		int startAddr = 0, len = 0;
		InputStream is;
		BufferedInputStream bis;
		try {
			is = new FileInputStream(filePath);
			bis = new BufferedInputStream(is);
			while ((len = bis.read(buffer)) != -1) {
				showHexa(buffer, len, startAddr);
				startAddr += len;
				System.out.println();
			}
			bis.close(); 
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void showHexa(byte[] buf, int size, int addr) {
		int index;
		byte hexaBuf[] = new byte[16];
		int remain = size % 16; 
		for (index=0; index < size/16; index++) {
			System.out.printf("%08X  ", addr+index*16);
			for (int k=0; k<16; k++) {
				hexaBuf[k] = buf[index*16+k];
				System.out.printf("%02X ", hexaBuf[k]);
				if (k==7) System.out.print(" ");
			}
			System.out.print(" ");
			showChar(hexaBuf, 16);
		}
		if (remain != 0) {
			System.out.printf("%08X  ", addr+index*16);
			for (int k=0; k<remain; k++) {
				hexaBuf[k] = buf[index*16+k];
				System.out.printf("%02X ", hexaBuf[k]);
				if (k==7) System.out.print(" ");
			}
			for (int k=remain; k<16; k++) {
				System.out.print("   ");
				if (k==7) System.out.print(" ");
			}
			System.out.print(" ");
			showChar(hexaBuf, remain);
		}
	}
	
	static void showChar(byte[] buf, int size) {
		for (int i=0; i<size; i++) {
			if (buf[i] >= 32 && buf[i] <= 126)
				System.out.print((char)buf[i]);
			else
				System.out.print(".");
			if (i==7) System.out.print(" ");
		}
		System.out.println();
	}
}
