public static int biggestIntPos(int arr[], int curStart, int curEnd) {
		int biggestPos = curStart;
		for (int i = curStart; i <= curEnd; i++) {
			if (arr[i] > arr[biggestPos]) {
				biggestPos = i;
			}
		}
		return biggestPos;
	}
