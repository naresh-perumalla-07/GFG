class Solution {

    public int countSubstring(String s) {
        int n = s.length();

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) == '1' ? 1 : -1);
        }

        long ans = mergeSort(prefix, 0, n);

        return (int) ans;
    }

    private long mergeSort(long[] arr, int l, int r) {
        if (l >= r) return 0;

        int mid = l + (r - l) / 2;

        long count = 0;

        count += mergeSort(arr, l, mid);
        count += mergeSort(arr, mid + 1, r);

        count += merge(arr, l, mid, r);

        return count;
    }

    private long merge(long[] arr, int l, int mid, int r) {

        long count = 0;

        int j = mid + 1;

        // Count pairs: left[i] < right[j]
        for (int i = l; i <= mid; i++) {
            while (j <= r && arr[j] <= arr[i]) {
                j++;
            }

            count += (r - j + 1);
        }

        long[] temp = new long[r - l + 1];

        int i = l;
        j = mid + 1;
        int k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna