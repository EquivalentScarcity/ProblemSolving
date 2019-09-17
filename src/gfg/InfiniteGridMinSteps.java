package gfg;

public class InfiniteGridMinSteps {

	/*
	 * You are given a sequence of points and the order in which you need to cover
	 * the points. Give the minimum number of steps in which you can achieve it. You
	 * start from the first point.
	 */

	// [(0, 0), (1, 1), (1, 2)]

	// Min Steps between A (x1,y1) and B (x2, y2) is max(abs[x2-x1],abs[y2-y1]);
	// Brute force will be to take (x2-x1) horizontal steps and (y2-y1) vertical
	// steps but it wont be min.
	// For Min Steps, traverse diagonal as much as possible and take either vertical
	// or horizontal remaining

	public static void main(String[] args) {

		int[] A = { 1, 2, 6 };
		int[] B = { 1, 2, 6 };
		System.out.println(coverPoints(A, B));
	}

	// Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y
	// coordinate of ith point respectively.
	public static int coverPoints(int[] A, int[] B) {

		int n = A.length;
		int len = 0;
		int x2_x1;
		int y2_y1;

		for (int i = 0; i < n-1; i++) {

			x2_x1 = A[i + 1] - A[i];
			y2_y1 = B[i + 1] - B[i];

			len = len + Math.max(Math.abs(x2_x1), Math.abs(y2_y1));

		}

		return len;

	}

}
