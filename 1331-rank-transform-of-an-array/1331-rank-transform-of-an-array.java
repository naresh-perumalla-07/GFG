class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];

        int j=0;

        for(int num:arr){
            temp[j]=arr[j];
            j++;
        }

        Arrays.sort(temp);

        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank++;
            }
        }

        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
        
    }
}





// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna