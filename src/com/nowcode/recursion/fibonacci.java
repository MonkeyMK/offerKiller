package com.nowcode.recursion;

public class fibonacci {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.Fibonacci(8));
	}

}

class Solution {
    public int Fibonacci(int n) {
    	if(n==0)
    		return 0;
    	else {
    		int f1 = 0;
    		int f2 = 1;
    		while(n-->0) {
    			f2 = f1 + f2;
    			f1 = f2 - f1;
    		}
    		return f1;
    	}
    }
}
