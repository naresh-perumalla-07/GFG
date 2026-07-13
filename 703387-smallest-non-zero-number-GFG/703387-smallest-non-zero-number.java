// class Solution {
// 	public int find(int[] arr) {
// 		// code here
// 		int max = 0;
// 		for (int num:arr) {
// 			max = Math.max(max, num);
			
// 		}
		
// 		int low = 1;
// 		int high = max;
// 		int ans = max;
		
// 		while (low <= high) {
// 			int mid = low + (high - low)/2;
// 			if (check(arr, mid)) {
// 				ans = mid;
// 				high = mid - 1;
// 			} else {
// 				low = mid + 1;
// 			}
// 		}
		
// 		return (int)ans;
// 	}
// 	public boolean check(int[]nums, int target) {
// 		long cur = target;
		
// 	for (int num : nums) {

//             // Once cur exceeds every possible array element,
//             // it will only keep increasing forever.
//             if (cur > maxVal) {
//                 return true;
//             }

//             cur = 2L * cur - num;

//             if (cur < 0) {
//                 return false;
//             }
//         }
// 		return true;
// 	}
// }


class Solution {
    public int find(int[] arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int low = 1;
        int high = max;
        int ans = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (check(arr, mid, max)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean check(int[] arr, long x, int maxVal) {
        long cur = x;

        for (int num : arr) {

            // Once cur exceeds every possible array element,
            // it will only keep increasing forever.
            if (cur > maxVal) {
                return true;
            }

            cur = 2L * cur - num;

            if (cur < 0) {
                return false;
            }
        }

        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna