package theMaximumSubarray;

import java.util.Scanner;

/**
 * @author yousuf-sap
 * 1. For a contiguous subarray: We need to include the negatives.
 * 	  We parse the array and sum the elements in a way that whenever there is a
 *    -ve element, we check if the current already parsed sum including it >0
 *    If yes, then continue with the same sum, else currentsum=0 and we parse on.
 * 2. For a non-contiguous subarray we ignore the negatives and just add all +ves
 */
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N, currentSum, bestSum, sumOfPositivies, val;
		//this loop runs for each test case
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();
			currentSum = bestSum = sumOfPositivies = val = 0;
			int arr[] = new int[N];
			for (int j = 0; j < N; j++) { 
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < N; j++) {
				if (j == 0) {
					sumOfPositivies = arr[0];
				} else {
					if (arr[j] > 0) {
						if (sumOfPositivies < 0) {
							sumOfPositivies = 0;
						}
						sumOfPositivies += arr[j];
					} else {
						if (arr[j] > sumOfPositivies) {
							arr[j] = sumOfPositivies;
						}
					}
				}
				val = currentSum + arr[j];
				if (val < 0) {
					currentSum = 0;
				} else {
					currentSum = val;
				}
				if (currentSum > bestSum) {
					bestSum = currentSum;
				}
			}
			if (bestSum == 0) {
				System.out.print(sumOfPositivies + " " + sumOfPositivies);
			} else {
				System.out.print(bestSum + " " + sumOfPositivies);
			}
			System.out.println();
		}
		sc.close();
	}
}
