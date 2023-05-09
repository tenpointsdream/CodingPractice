package pkg;


public class Smallest2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 2, 2 }, { 1, 2 }, { 3, 4 } };
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		System.out.println(smallestIn2DMatrix(matrix));

	}

	public static int smallestIn2DMatrix(int[][] matrix) {
		int smallestInCol = 0;
		int largestInRow = 0;
		int col = 0;
		int row = 0;
		while (col < matrix.length) {
			largestInRow = 0;
			for (int i = 0; i < matrix[0].length; i++) {
				if (matrix[row][i] > largestInRow) {
					largestInRow = matrix[row][i];
				}
			}

			int c = 0;
			while (c < matrix[0].length) {
				smallestInCol = matrix[row][c];
				if (matrix[row][c] == largestInRow) {
					for (int i = 0; i < matrix.length; i++) {
						if (matrix[i][c] < smallestInCol) {
							smallestInCol = matrix[i][col];
						}
					}
					if (matrix[row][c] == smallestInCol) {
						return matrix[row][c];
					}
				}
				c++;
			}
			col++;
			row++;
		}
		return -1;
	}
}
