package com.nowcode.search;

import java.util.ArrayList;


public class rotateArray {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] array = {4,5,1,1,1,2,2,3,3,3,4,4};
		System.out.println(s.minNumberInRotateArray(array));
	}
	
}

class Solution {
    public int minNumberInRotateArray(int [] array) {
    	int low,high,mid,min;
    	low = 0;
    	high = array.length - 1;
    	while(low < high && high-low > 1) {
    		mid = (low + high) / 2;
    		if(array[mid] >= array[low]) {
    			low = mid;
    		}else{
    			high = mid;
    		}
    	}
    	min = array[low] < array[high] ? array[low] : array[high];
    	return min;
    }
}