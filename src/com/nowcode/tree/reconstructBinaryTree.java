package com.nowcode.tree;


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class reconstructBinaryTree {

	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = reConstructBinaryTree(pre, in);
		printBinaryTree(root);
	}

	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		TreeNode reTree = re(0,pre.length-1,pre,0,in.length-1,in);
		return reTree;
	}
	
	public static TreeNode re(int pStart,int pEnd,int[] pre,int iStart,int iEnd,int[] in) {
		if(pStart > pEnd || iStart > iEnd)
			return null;
		TreeNode root = new TreeNode(pre[pStart]);
		int index = -1;
		for(int i=iStart;i<=iEnd;i++) {
			if(pre[pStart] == in[i]) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("not find");
		}
		root.left = re(pStart+1, pStart+index-iStart, pre, iStart, index-1, in);
		root.right = re(pStart+index-iStart+1, pEnd, pre, index+1, iEnd, in);
		return root;
	}
	
	public static void printBinaryTree(TreeNode root) {
		if(root!=null) {
			printBinaryTree(root.left);System.out.println(root.val);
			printBinaryTree(root.right);
			
		}
	}
}



