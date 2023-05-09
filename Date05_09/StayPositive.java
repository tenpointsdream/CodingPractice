package pkg;

public class StayPositive {
	public static void main(String[] args) {
		int[] arr = { -4, 3, 2, 1 };
		int[] arr2 = {3, -6, 5, -2, 1};
		int[] arr3 = {5};
		System.out.println(minStart(arr));
		System.out.println(minStart(arr2));
		System.out.println(minStart(arr3));
	}

	public static long minStart(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		if (min > 0)
			return 1;
		int count = 1;
		int i = 0;
		int sum = count;
		while (true) {
			boolean isTrue = true;
			if (((arr[i] + sum) > 0) && (i < arr.length)) {
				isTrue = true;
				sum += arr[i];
				i++;
			} else {
				isTrue = false;
				i = 0;
				count++;
				sum = count;
			}
			if (isTrue && (i == arr.length - 1)) {
				break;
			}
		}
		return count;
	}
}
