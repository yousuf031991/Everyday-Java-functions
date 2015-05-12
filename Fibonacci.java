package nthFibonacciNo;

import java.util.Scanner;

public class Solution {
	/**
	 * first number is 1, second is 2..
	 */
	public static int nthFibonacciNumber(int N) {
		int a = 0;
		int b = 1;
		int num = 0;
		int sum = 0;
		while (num < N) {
			sum = a + b;
			a = b;
			b = sum;
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(nthFibonacciNumber(N));
		sc.close();
	}
}
