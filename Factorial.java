public static long factorial(int n) {
		long fact = 1;
		for (int c = 1; c <= n; c++) {
			fact = fact * c;
		}
		return fact;
	}
