package com.nowcode.recursion;

public class jumpFloor {
	public static int[] arr;
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(s.JumpFloor(5));
	}

}

class Solution2 {
    public int JumpFloor(int target) {
    	if(target < 2) {
    		return 1;
    	} else {
    		return JumpFloor(target - 1) + JumpFloor(target - 2);
    	}
    }
}
