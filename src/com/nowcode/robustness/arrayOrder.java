package com.nowcode.robustness;

public class arrayOrder {

	public static void main(String[] args) {
		
	}

}

class Solution1 {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int[] orderArray = new int[len];
        int j = 0;
        for(int i=0;i<len;i++) {
        	if((array[i] & 1) == 1) {
        		orderArray[j++] = array[i];
        	}
        }
        for(int i=0;i<len;i++) {
        	if((array[i] & 1) == 0) {
        		orderArray[j++] = array[i];
        	}
        }
        for(int i=0;i<len;i++) {
        	array[i] = orderArray[i];
        }
    }
}