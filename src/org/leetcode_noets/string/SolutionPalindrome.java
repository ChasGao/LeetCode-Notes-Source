package org.leetcode_noets.string;

public class SolutionPalindrome {

	/**
	 * Given a string, determine if it is a palindrome, considering only
	 * alphanumeric characters and ignoring cases. <br/>
	 * 判读一个字符串是不是回文，只考虑这个字符串中的字母数字，并且忽略字母的大小写 入参的空值检查不想写了;-)
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome2(String s) {
		boolean isPal = false;
		String actul = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		// 使用reverse方法
		String reversedActul = new StringBuffer(actul).reverse().toString();
		if (actul.equals(reversedActul))
			isPal = true;
		return isPal;
	}

	public boolean isPalindrome(String s) {
		boolean isPal = true;
		String actul = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		// 同时从字符串头和结尾扫描字符，如果所有字符都相同，那么这个字符串即是回文;这个方法需要维护头索引、尾索引
		int indexHead = 0, indexTail = actul.length() - 1;
		while (indexHead < actul.length() - 1 && indexTail > 0) {
			if (actul.charAt(indexHead) != actul.charAt(indexTail))
				isPal = false;
			indexHead++;
			indexTail--;
		}
		return isPal;
	}

	public static void main(String[] args) {
		SolutionPalindrome solution = new SolutionPalindrome();
		boolean result = solution.isPalindrome("Anna");
		boolean result2 = solution.isPalindrome2("Anna");
		System.out.println(result);
		System.out.println(result2);
	}
}
