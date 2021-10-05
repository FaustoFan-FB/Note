package com.fausto.sparsearray;

/**
 * @author: fausto
 * @date: 2021/8/2 9:10
 * @description: 稀疏数组
 */
public class SparseArray {
	
	
	public static void main(String[] args) {
		//创建一个原始的二维数组11*11
		//0:表示没有棋子 , 1:表示黑子 , 2:表示蓝子
		int[][] chessArr0 = new int[11][11];
		chessArr0[1][2] = 1;
		chessArr0[2][3] = 2;
		System.out.println("原始的二维数组");
		for (int[] row : chessArr0) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
		//略.....
		
	}
	
}
