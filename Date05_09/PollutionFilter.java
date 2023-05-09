package pkg;

public class PollutionFilter {
	public static void main(String[] args) {
		int[] A = { 5, 19, 8, 1 };
		int[] B = {10, 10};
		int[] C = {3, 0, 5};
		Solution s = new Solution();
		System.out.println(s.solution(A));
		System.out.println(s.solution(B));
		System.out.println(s.solution(C));
	}
}

class Solution {
	public int solution(int[] A) {

		int largest = 0;

		int total = 0;
		for (int i = 0; i < A.length; i++) {
			total += A[i];
		}
		int filterCount = 0;
		int result = 0;
		while (true) {
			for (int i = 0; i < A.length; i++) {
				largest = 0;
				for (int j = 0; j < A.length; j++) {
					if (largest < A[j]) {
						largest = A[j];
					}
				}
				result = 0;
				for (int j = 0; j < A.length; j++) {
					if (A[i] == largest) {
						A[i] /= 2;
						filterCount++;
					}
				}
				for (int j = 0; j < A.length; j++) {
					result += A[j];
				}
				if (result <= (Math.ceil((double) total / 2)))
					return filterCount;
			}
		}
	}
}