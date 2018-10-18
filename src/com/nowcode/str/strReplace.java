package com.nowcode.str;

public class strReplace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(sb));
	}
	
	public static String replaceSpace(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==' ') {
				sb.append("%20");
			}else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
    }

}
