// class Solution {
//     public int countCommas(int n) {
//         String num=String.valueOf(n);
//         if(num.length()<=3)return 0;
//         if(1000<=n && n<10000){

//         int base=(int)Math.pow(10,num.length()-1);
//         return n-base+1;
//         }else{
//             // int base1=(int)Math.pow(10,num.length()-1);
//             // int res1=n-base1+1;
//             int base2=(int)Math.pow(10,num.length()-2);
//             return n-base2+1;
//             // return res1+res2;
//         }
        
//     }
// }

class Solution {
    public int countCommas(int n) {
        if (n < 1000) {
            return 0;
        }

        return n - 1000 + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna