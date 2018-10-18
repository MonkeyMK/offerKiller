package com.nowcode.linklist;
import java.util.ArrayList;
import java.util.Stack;



public class returnArrayList_Sol2 {

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
		Stack<Integer> stack = new Stack<>();
		ListNode pNode = listNode;
		while(pNode!=null) {
			stack.push(pNode.val);
			pNode = pNode.next;
		}
		
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}


