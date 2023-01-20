class Solution{
   public int removeStudents(int H[],int N){
  //code here
     int dp[] = new int[N+1];
     int ans = 0;
     Arrays.fill(dp,Integer.MAX_VALUE);
     dp[0] = Integer.MIN_VALUE;
     for(int i=0;i<N;i++)
     {
       int key = H[i];
       int low=0,high = dp.length;
       while(low<=high)
       {
         int mid = low +(high-low)/2;
         if(dp[mid]>=key&&dp[mid-1]<key){
          dp[mid] = key;
           break;
         }
         else if(dp[mid]<key)
         { 
           low = mid + 1;
         }
         else{
           high = mid - 1;
         }
       }
     }
     
     for(int i=N;i>=0;i--){
       if(dp[i]!=Integer.MAX_VALUE){
        ans = i;
         break;
       }
     }
     return N-ans;
     
     
   }

};
