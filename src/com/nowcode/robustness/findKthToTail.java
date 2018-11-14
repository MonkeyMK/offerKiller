//package com.nowcode.robustness; 
///** 
//* @author 小炉子 863956237@qq.com: 
//* @version 创建时间：2018年11月6日 上午10:58:08 
//* 类说明 
//*/
//public class findKthToTail {
//
//}
//
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
//class Solution3 {
//    public ListNode FindKthToTail(ListNode head,int k) {
//    	if(k<1)
//    		return null;
//    	int len = 0;
//    	ListNode p = head;
//    	while(p!=null) {
//    		len++;
//    		p = p.next;
//    	}
//    	if(k>len)
//    		return null;
//    	int index = len - k;
//    	p = head;
//    	for(int i=0;i<index;i++) {
//    		p = p.next;
//    	}
//    	return p;
//    }
//}
// 