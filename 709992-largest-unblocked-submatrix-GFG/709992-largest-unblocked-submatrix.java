class Solution {
	public int largestArea(int n, int m, int k, int[][] arr) {
		
		if (k == 0)return n*m;
		
		int gapR = Integer.MIN_VALUE;
		int gapC = Integer.MIN_VALUE;
		int[]blockR = new int[k];
		int[] blockC = new int[k];
		int idx = 0;
		for (int[]block:arr) {
			int r = block[0];
			int c = block[1];
			blockR[idx] = r;
			blockC[idx] = c;
			idx++;
		}
		
		Arrays.sort(blockR);
		Arrays.sort(blockC);
		
		int rowSize = blockR.length;
		int colSize = blockC.length;
		
		for (int i = 0; i <= rowSize; i++) {
			if (i == 0) {
				gapR = Math.max(blockR[i]-0 - 1, gapR);
			} else if (i == rowSize) {
				gapR = Math.max(n + 1 - blockR[i - 1]-1, gapR);
			} else {
				gapR = Math.max(blockR[i]-blockR[i - 1]-1, gapR);
			}
		}
		
		for (int i = 0; i <= colSize; i++) {
			if (i == 0) {
				gapC = Math.max(blockC[i]-0 - 1, gapC);
			} else if (i == colSize) {
				gapC = Math.max(m + 1 - blockC[i - 1]-1, gapC);
			} else {
				gapC = Math.max(blockC[i]-blockC[i - 1]-1, gapC);
			}
		}
		
		return gapR*gapC;
		
		// code here
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna