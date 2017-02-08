package org.leetcode_noets.recurrence;

/**
 * @author administator
 */
public class Factorial {

	/**
	 * 递归方式求一个数的阶乘. 对于n! ,n=0或者n=1时，n!=1.
	 * 
	 * @param i
	 *            必须为正整数
	 * @return
	 */
	public long fact(int i) {
		long result = 0;
		if (i == 0 || i == 1 || i == -1) {
			result = 1;
		} else {
			result = i * fact(i - 1);
		}

		return result;
	}

	/**
	 * 递归的方式实现对一个正整数的逆序输出
	 * 
	 * @param i
	 * @return
	 */
	public String reverseInt(int i) {
		//int result = 0;
		StringBuffer resultStr = new StringBuffer();

		if (i < 0)
			i = Math.abs(i);

		if (i < 10) {
			return String.valueOf(i);
		}
		resultStr.append(i % 10).append(reverseInt(i / 10));
		//System.out.println(resultStr.toString());
		//result = Integer.parseInt(resultStr.toString());
		return resultStr.toString();
	}

	public static void main(String[] args) {

		long result = new Factorial().fact(3);
		System.out.println(result);
		String result1 = new Factorial().reverseInt(2010);
		System.out.println(result1);
	}
}
