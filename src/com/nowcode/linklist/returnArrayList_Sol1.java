package com.nowcode.linklist;
import java.util.ArrayList;

import org.w3c.dom.NodeList;


public class returnArrayList_Sol1 {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode tail = head;
		for(int i=1;i<10;i++) {
			ListNode newNode = new ListNode(i);
			tail.next = newNode;
			tail = tail.next;
		}
		System.out.println(printListFromTailToHead(head));;
	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		if(listNode == null) {
			return list;
		}
		ListNode low,mid,high;
		low = listNode;
		mid = low.next;
		if(mid!=null) {
			high = mid.next;
		}else {
			high = null;
		}
		if(mid==null) {
			mid = low;
		}else if(high==null) {
			mid.next = low;
			low.next = null;
		}else {
			low.next = null;
			while(high!=null) {
				mid.next = low;
				low = mid;
				mid = high;
				high = high.next;
			}
			mid.next = low;
		}
		
		
		ListNode head = mid;
		while(head!=null) {
			list.add(head.val);
			head = head.next;
		}
		
		return list;
	}

}

//class ListNode {
//	int val;
//	ListNode next = null;
//
//	ListNode(int val) {
//		this.val = val;
//	}
//}
