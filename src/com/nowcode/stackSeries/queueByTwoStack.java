package com.nowcode.stackSeries;

import java.util.Stack;

public class queueByTwoStack {


	public static void main(String[] args) {
		Solution s = new Solution();
		for(int i=1;i<=5;i++) {
			s.push(i);
		}
		for(int i=1;i<=5;i++) {
			System.out.println(s.pop());;
		}
	}

}

class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.isEmpty()) {
	    	while(!stack1.isEmpty()) {
	    		int node = stack1.pop();
	    		stack2.push(node);
	    	}
    	}
    	
    	return stack2.pop();
    }
}
