//package com.nowcode.robustness;
//
//import java.awt.List;
//
///** 
//* @author 小炉子 863956237@qq.com: 
//* @version 创建时间：2018年11月9日 上午10:53:44 
//* 类说明 
//*/
//public class reverseList {
//
//	public static void main(String[] args) {
//		
//	}
//
//}
//
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
//class Solution4 {
//    public ListNode ReverseList(ListNode head) {
//    	if(head==null)
//    		return null;
//    	ListNode reverseHead = null;
//    	ListNode current = head;
//    	ListNode temp;
//    	while(current!=null) {
//    		if(reverseHead==null) {
//    			temp = current.next;
//    			reverseHead = current;
//    			reverseHead.next = null;
//    		}else {
//    			temp = current.next;
//    			current.next = reverseHead;
//    			reverseHead = current;
//    		}
//    		current = temp;
//    	}
//    	return reverseHead;
//    }
//}