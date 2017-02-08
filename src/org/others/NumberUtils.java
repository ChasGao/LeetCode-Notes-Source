package org.others;

public class NumberUtils {

	/**
	 * 判断素数
	 * 
	 * @param m
	 *            正整数
	 * @return true or false
	 */
	public static boolean isPrimeNumber(int m) {
		boolean flag = false;
		for (int i = 2; i <= m / 2; i++) {
			if (m % i == 0) {
				flag = false;
				break; // 能被非 1和本身的整数整除
			} else {
				flag = true;
			}

		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(11));
	}
}
