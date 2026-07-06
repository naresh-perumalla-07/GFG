class Solution {
    public int maxPathSum(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        
        int sumA=0;
        int sumB=0;
        
        int ans=0;
        
        int i=0;int j=0;
        
        while(i<n && j<m){
            if(a[i]<b[j]){
                sumA+=a[i];
                i++;
            }else if(a[i]>b[j]){
                sumB+=b[j];
                j++;
            }else{
                ans+=Math.max(sumA,sumB)+a[i];
                i++;
                j++;
                sumA=0;
                sumB=0;
            }
        }
        while(i<n){
            sumA+=a[i];
            i++;
        }
        while(j<m){
            sumB+=b[j];
            j++;
        }
        
        ans+=Math.max(sumA,sumB);
        return ans;
        // code here
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna