class Solution {
    public int countKdivPairs(int[] arr, int k) {
        
        int pairs=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int num: arr){
            int rem=num%k;
            
            int need=(k-rem)%k;
            
            pairs+=map.getOrDefault(need,0);
            
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        return pairs;
        // code here
        // int cnt=0;
        // int n=arr.length;
        
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((arr[i]+arr[j])%k==0)cnt++;
        //     }
        // }
        // return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna