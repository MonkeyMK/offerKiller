package com.nowcode.search;

import java.util.Scanner;

public class twoDimArray_Sol1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
//		int[][] array = {
//				{1,4,8},
//				{3,5,10},
//				{7,9,14},
//		};
		int[][] array = {{}};
		int target = in.nextInt();
		System.out.println(Find(target, array));
		in.close();
	}
	
    public static boolean Find(int target, int [][] array) {
        int M,N;
        M = array.length;
        if(M==0)return false;
        
        N = array[0].length;
        if(N==0)return false;
        
        // 大于最大，小于最小
        if(target<array[0][0] || target>array[M-1][N-1])
        	return false;
        
        int row;
        for(row=0;row<M;row++) {
        	if(target >= array[row][0] && target <= array[row][N-1])
        		break;
        }
        // 不存在数组中
    	if(row == M)
    		return false;
    	int col;
    	for(col=0; col<N && array[row][col]<=target; col++) {
    		if(array[row][col] == target || binaryFind(target, array, col, row)) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean binaryFind(int target, int[][] array, int col, int row) {
    	int M = array.length;
    	int start = row;
    	int end = M-1;
    	int mid = (start + end)/2;
    	while(start <= end) {
    		if(array[mid][col] == target) {
    			return true;
    		}else if(array[mid][col] > target) {
    			end = mid-1;
    		}else {
    			start = mid+1;
    		}
    		mid = (start + end)/2;
    	}
    	return false;
    }
}
