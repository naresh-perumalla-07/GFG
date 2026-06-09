class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        // code here
        int n=seats.length;
        if(k==0)return true;
        if(n==1){
            return seats[0]==0 && k<=1;
        }
        // if(n==1 && k>1)return false;
        // if(n==1 && k==1 && seats[0]==0)return true;
        
        for(int i=0;i<n;i++){
            if(i==0){
               if(seats[i]==0 && seats[i+1]!=1){
                   seats[i]=1;
                   k--;
                   if(k==0)return true;
               }
            }else if(i==n-1){
                if(seats[i]==0 && seats[i-1]!=1){
                    seats[i]=1;
                    k--;
                    if(k==0)return true;
                }
            }else{
                if(seats[i]==0 && seats[i-1]!=1 && seats[i+1]!=1){
                    seats[i]=1;
                    k--;
                    if(k==0)return true;
                }
            }
        }
        
        return k==0 ? true : false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna