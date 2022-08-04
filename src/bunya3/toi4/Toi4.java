package bunya3.toi4;

import java.util.ArrayList;
import java.util.List;

// çÏÇËÇ©ÇØ

public class Toi4 {

	public static void main(String[] args) {
		int[][] matrix = { { 3, 0, 0, 0, 0 }, 
							{ 0, 2, 2, 0, 0 }, 
							{ 0, 0, 0, 1, 3 },
							{ 0, 0, 0, 2, 0 },
							{ 0, 0, 0, 0, 1 } };
		List<Integer>[] result = transformSparseMatrix(matrix);
		
		outArray(result);
	}

	private static void outArray(List<Integer>[] result) {
		System.out.print("{");
		out1line(result[0]);
		System.out.print(",");
		out1line(result[1]);
		System.out.print(",");
		out1line(result[2]);
		System.out.print("}");
	}

	private static void out1line(List<Integer> r) {
		System.out.print("{");
		for(int i=0 ; i<r.size()-1;i++) {
			System.out.print(r.get(i)+",");
		}
		System.out.print(r.get(r.size()-1)+"}");
	}

	static List<Integer>[] transformSparseMatrix(int[][] matrix) {
		int i = 0, j = 0;
		List<Integer>[] sparsematrix = new List[3];

		sparsematrix[0] = new ArrayList<Integer>();
		sparsematrix[1] = new ArrayList<Integer>();
		sparsematrix[2] = new ArrayList<Integer>();

		for (i = 1; i <= matrix.length ; i++) {
			for (j = 1; j <= matrix[0].length ; j++) {
				if (matrix[i - 1][j - 1] != 0) {
					sparsematrix[0].add(i);
					sparsematrix[1].add(j);
					sparsematrix[2].add(matrix[i - 1][j - 1]);
				}
			}
		}

		return sparsematrix;
	}
}
