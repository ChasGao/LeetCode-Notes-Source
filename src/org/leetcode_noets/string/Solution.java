package org.leetcode_noets.string;

import java.util.HashMap;

public class Solution {
	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Example: Given s = "hello", return "olleh".
	 * 
	 * @param s
	 * @return
	 */
	public String reverseString(String s) {
		// method 1: use StringBuilder
		// return new StringBuilder(s).reverse().toString();
		char[] word = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);

	}
		/**
		 * Given an input string, reverse the string word by word. For example,	Given s = "the sky is blue",
				return "blue is sky the
		 * 反转一段英文		
		 * @param s
		 * @return
		 */
	   public String reverseWords(String s) {
	     String[] words=   s.trim().split("\\s+");
		  String out=""; 
		   for(int i=words.length-1;i>0;i--){
			   out=out+words[i]+" ";
		   }
		  
		  return out+words[0];
	    }
	
	/**
	 * Given a string, find the first non-repeating character in it and return
	 * it's index. If it doesn't exist, return -1.
	 * 第一个不重复出现过的字符的在字符串中的索引，若不存在返回-1
	 * 
	 * @param s
	 * @return
	 */
	public int firstUniqChar(String s) {
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (s.indexOf(a[i]) == s.lastIndexOf(a[i]))
				return i;
		}
		return -1;
	}

	/**
	 * Given a string, find the length of the longest substring without
	 * repeating characters. <br/>
	 * 找出一个字符串中最长的无重复字符的子串的长度 <br/>
	 * Examples: Given "abcabcbb", the answer is "abc", which the length is 3.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0)
			return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		for (int i = 0, j = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		return max;
	}
	/**
	 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
		Please note that the string does not contain any non-printable characters.
		<br/> 求一段英文中的单词个数
	 * @param s
	 * @return
	 */
	public int countSegments(String s) {
		if(s.equals("")) return 0;
		String temp ="x "+s;
		String[] subs = temp.split("\\s+");
		return subs.length-1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		int length = solution.lengthOfLongestSubstring("abcabcbb");
		System.out.println(length);

		String rs = solution.reverseString("ssdb");
		System.out.println(rs);

		int index = solution.firstUniqChar("bsaas");
		System.out.println(index);

		int countSeg=solution.countSegments("Hello, my name is John");
		System.out.println(countSeg);
		int countSeg1=solution.countSegments("");
		System.out.println(countSeg1);
		
		String out=solution.reverseWords("the sky is blue");
		System.out.println(out);
	}

}
