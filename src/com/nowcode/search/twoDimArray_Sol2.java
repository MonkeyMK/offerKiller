package com.nowcode.search;

import java.util.Scanner;

public class twoDimArray_Sol2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] array = {
				{1,4,8},
				{3,5,10},
				{7,9,14},
		};
		//		int[][] array = {{}};
		int target = in.nextInt();
		System.out.println(Find(target, array));
		in.close();
	}

	public static boolean Find(int target, int [][] array) {
		int M = array.length;
		int N = array[0].length;
		int row = M-1;
		int col = 0;
		while(row>=0 && col<=N-1) {
			if(array[row][col]==target) {
				return true;
			}else if(array[row][col] < target) {
				col += 1;
			}else {
				row -= 1;
			}
		}
		return false;
	}
}
