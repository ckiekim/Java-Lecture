package date190415;

import java.util.Arrays;

public class Ex05AnyPung {
	public static void main(String[] args) {
		int[][] tile = new int[5][5];
		for (int i=0; i<5; i++)
			for (int k=0; k<5; k++)
				tile[i][k] = (int)(Math.random()*4) + 1;
		printTile(tile);

		while (true) {
			int[][] found = findPung(tile);
			break;
/*			boolean check = false;
			for (int i=0; i<5; i++) {
				for (int k=0; k<5; k++)
					if (found[i][k] == 8) {
						check = true;
						break;
					}
			}
			if (check)
				break;
			tile = collapsePung(found, tile);
			printTile(tile);*/
		}
	}
	static int[][] findPung(int[][] src) {
		int[][] dst = new int[5][5];
		int[][] tpSrc = transpose(src);
		
		int[][] rows = new int[5][];
		int[][] cols = new int[5][];
		for (int i=0; i<5; i++) {
			rows[i] = findRowPung(src[i]);
			cols[i] = findRowPung(tpSrc[i]);
		}
		int[][] tpCols = transpose(cols);
		/*System.out.println("Rows:");
		printTile(rows);
		System.out.println("Columns:");
		printTile(tpCols);*/
		// merge rows and columns
		for (int i=0; i<5; i++)
			for (int k=0; k<5; k++)
				if (rows[i][k] == 8 || tpCols[i][k] == 8)
					dst[i][k] = 8;
				else
					dst[i][k] = src[i][k];
		System.out.println("findPung()");
		printTile(dst);
		return dst;
	}
	static int[] findRowPung(int[] row) {
		int result[] = new int[5];
		if (row[0] == row[1] && row[1] == row[2]) {
			if (row[2] == row[3] && row[3] == row[4])
				for(int i=0; i<5; i++)
					result[i] = 8;
			else if (row[2] == row[3] && row[3] != row[4]) {
				for(int i=0; i<4; i++)
					result[i] = 8;
				result[4] = row[4];
			} else {
				for(int i=0; i<3; i++)
					result[i] = 8;
				result[3] = row[3]; result[4] = row[4];
			}
		} else if (row[1] == row[2] && row[2] == row[3]) {
			result[0] = row[0];
			if (row[3] == row[4]) 
				for(int i=1; i<5; i++)
					result[i] = 8;
			else {
				for(int i=1; i<4; i++)
					result[i] = 8;
				result[4] = row[4];
			}
		} else if (row[2] == row[3] && row[3] == row[4]) {
			result[0] = row[0]; result[1] = row[1];
			for(int i=2; i<5; i++)
				result[i] = 8;
		} else {
			for(int i=0; i<5; i++)
				result[i] = row[i];
		}
		//System.out.println(Arrays.toString(result));
		return result;
	}
	static int[][] transpose(int[][] src) {
		int[][] dst = new int[5][5];
		for (int i=0; i<5; i++)
			for (int k=0; k<5; k++)
				dst[k][i] = src[i][k];
		return dst;
	}
	static int[][] collapsePung(int[][] key, int[][] src) {
		int[][] dst = new int[5][5];
		
		
		return dst;
	}
	static void printTile(int[][] tile) {
		for (int i=0; i<5; i++) {
			System.out.println(Arrays.toString(tile[i]));
		}
	}
}
