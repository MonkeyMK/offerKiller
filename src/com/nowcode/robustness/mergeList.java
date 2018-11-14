package com.nowcode.robustness; 
/** 
* @author 小炉子 863956237@qq.com: 
* @version 创建时间：2018年11月14日 下午8:37:08 
* 类说明 
*/
public class mergeList {

	public static void main(String[] args) {
		
	}

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution4 {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null) {
    		return list2;
    	}else if(list2==null) {
    		return list1;
    	}
    	
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode newNode = null;
        ListNode newHead = null;
        ListNode current = null;
        while(p1!=null && p2!=null) {
        	if(p1.val < p2.val) {
        		newNode = p1;
        		p1 = p1.next;
        	}else {
        		newNode = p2;
        		p2 = p2.next;
        	}
        	
        	if(newHead==null) {
        		newHead = newNode;
        	}else {
        		current.next = newNode;
        	}
        	current = newNode;
        }

        if(list1 == null){
        	current.next = list2;
        }else{
        	current.next = list1;
        }
        return newHead;
    }
}
 