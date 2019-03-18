package verify;

import java.util.Arrays;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] x = { {1, 2, 3, 4}, {5, 6, 7, 8} };
		int[][] y = { {1, 2}, {3, 4}, {5, 6}, {7, 8} };
		matPrint(x); matPrint(y);
		int[][] result = matMul(x, y);
		if (result != null)
			matPrint(result);
		else
			System.out.println("x 행렬의 열수와 y 행렬의 행수가 같아야 함");
	}
	
	public static int[][] matMul(int[][] x, int[][] y) {
		if (x[0].length != y.length)
			return null;
		int row = x.length;
		int col = y[0].length;
		int size = y.length;
		int[][] result = new int[row][col];
		
		for (int r=0; r < row; r++) {
			for (int c=0; c < col; c++) {
				int sum = 0;
				for (int i=0; i < size; i++) {
					sum += x[r][i] * y[i][c];
				}
				result[r][c] = sum;
			}
		}
		
		return result;
	}
	
	public static void matPrint(int[][] mat) {
		for(int[] matRow: mat)
			System.out.println(Arrays.toString(matRow));
	}
}
