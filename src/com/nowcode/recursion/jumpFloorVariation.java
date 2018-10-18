package com.nowcode.recursion;

public class jumpFloorVariation {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.JumpFloorII(0));
	}

}

class Solution3 {
    public int JumpFloorII(int target) {
        if(target<=1) {
        	return 1;
        }else {
//        	return (int) (Math.pow(2, target-2) * 2);
        	return 2<<(target-2);
        }
    }
}