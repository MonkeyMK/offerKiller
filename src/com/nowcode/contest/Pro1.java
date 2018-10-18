package com.nowcode.contest;

import java.util.Scanner;

public class Pro1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		int[][] directions = {
				{-1,-1,-1,0,0,1,1,1},
				{-1,0,1,-1,1,-1,0,1},
		};
		
		while(t--!=0) {
			int N = in.nextInt();
			int M = in.nextInt();
			int count = 0;
			for(int row=0;row<N;row++) {
				for(int col=0;col<M;col++) {
					int temp = 0;
					for(int i=0;i<8;i++) {
						if(((row+directions[0][i]>=0) && (row+directions[0][i]<N)) 
								&& (col+directions[1][i]>=0) && (col+directions[1][i]<M)) {
							temp++;
						}
					}
					if(temp%2==0)count++;
				}
			}
			System.out.println(count);
		}
	}

}
