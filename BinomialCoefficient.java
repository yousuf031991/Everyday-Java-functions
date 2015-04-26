public static long binomialCoefficient(int n, int k) {
		long arr[][] = new long[n + 1][k + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if ((i == j) || (j == 0)) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		return arr[n][k];
	}
