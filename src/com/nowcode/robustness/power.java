package com.nowcode.robustness;

/**
 * 这道题主要注意：
 * 1、负数次幂
 * 2、0的负数次幂
 * 3、0次幂
 * 4、>>1 右移一位等于除以二
 * 5、 & 1 与一做与运算可以判断偶数奇数
 * 6、 logN 级的解法
 * @author 86395
 *
 */

public class power {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.Power(2, -2));
	}

}

//class Solution {
//    public double Power(double base, int exponent) {
////    	double result = 1.0;
////        if(exponent == 0) {
////        	return 1.0;
////        }else if(exponent>0){
////        	for(int i=1;i<=exponent;i++) {
////        		result *= base;
////        	}
////        }else{
////        	exponent = -exponent;
////        	for(int i=1;i<=exponent;i++) {
////        		result /= base;
////        	}
////        }
////        return result;
//    	return Math.pow(base, exponent);
//  }
//}

class Solution {
    public double Power(double base, int exponent) {
    	if(exponent==0) {
    		return 1;
    	}else if(exponent==1) {
    		return base;
    	}
    	
    	double result = 1.0;
    	int absExponent = exponent>0 ? exponent : -exponent;
    	result = Power(base, absExponent>>1);
    	result *= result;
    	if((exponent & 1) == 1) {
    		result = result * base;
    	}
    	if(exponent < 0) {
    		result = 1/result;
    	}
    	return result;
  }
}

