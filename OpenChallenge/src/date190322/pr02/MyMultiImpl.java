package date190322.pr02;

public class MyMultiImpl implements MyMulti {
	@Override
	public int max(int[] intArray) {
		int maxItem = intArray[0];
		for (int i=0; i<intArray.length; i++) {
			if (maxItem < intArray[i])
				maxItem = intArray[i];
		}
		return maxItem;
	}

	@Override
	public int min(int[] intArray) {
		int min = intArray[0];
		for (int item: intArray) {
			if (min > item)
				min = item;
		}
		return min;
	}

	@Override
	public int sum(int[] intArray) {
		int sum = 0;
		for (int item: intArray)
			sum += item;
		return sum;
	}

	@Override
	public double avg(int[] intArray) {
		int sum = sum(intArray);
		double avg = (double)sum / intArray.length;
		return avg;
	}

}
