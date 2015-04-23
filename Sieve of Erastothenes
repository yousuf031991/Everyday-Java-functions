public static int sieveOfErastothenes(int n) {
		int sieve[] = new int[n + 1];
		for (int i = 2; i <= n; i++) {
			sieve[i] = i;
		}
		int temp;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (sieve[i] != 0) {
				temp = i * i;
				while (temp <= n) {
					sieve[temp] = 0;
					temp += i;
				}
			}
		}
		int noOfPrimesUptoN = 0;
		int arrayOfPrimesUptoN[] = new int[n + 1];
		int tempCount = 0;
		for (int i = 2; i <= n; i++) {
			if (sieve[i] != 0) {
				noOfPrimesUptoN++;
				arrayOfPrimesUptoN[tempCount++] = sieve[i];
			}
		}
		return noOfPrimesUptoN;
	}
