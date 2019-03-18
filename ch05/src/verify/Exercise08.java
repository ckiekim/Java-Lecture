package verify;
public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = { 
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};	

		int sum = 0;
		double avg = 0.0;

		int count = 0;
		int min = array[0][0];
		int max = array[0][0];
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				count++;
				if (min > array[i][k])
					min = array[i][k];
				if (max < array[i][k])
					max = array[i][k];
			}
		}
		avg = (double) sum / count;

		double var = 0.0;
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				var += (array[i][k] - avg)*(array[i][k] - avg);
			}
		}
		var /= count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("var: " + var);
	}
}

