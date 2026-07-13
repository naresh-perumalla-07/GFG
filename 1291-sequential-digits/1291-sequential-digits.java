class Solution {
    public List<Integer> sequentialDigits(int l, int h) {
        List<Integer>ans =new ArrayList<>();

        String s="123456789";

        int low=String.valueOf(l).length();
        int high=String.valueOf(h).length();

        for(int i=low;i<=high;i++){
            for(int start=0;start+i<=9;start++){
                int num=Integer.parseInt(s.substring(start,start+i));


            if(num>=l && num<=h)ans.add(num);
            }
        }

        return ans;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna