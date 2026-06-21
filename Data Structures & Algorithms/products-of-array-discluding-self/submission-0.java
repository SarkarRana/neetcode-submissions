class Solution {
    public int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int[] dp = new int[size];

        dp[0] = 1;
        for(int i=1;i<size;i++){
            dp[i] = nums[i-1]*dp[i-1];
        }

        // [1,1,2,8]

        int[] dp2 = new int[size];
        dp2[size-1] = 1;
        for(int i =size-2;i>=0;i--){
            dp2[i] = nums[i+1]*dp2[i+1];
        }

        int[] res = new int[size];
        for(int i =0 ;i <size;i++){
            res[i] = dp[i]*dp2[i];
        }

        return res;
        
    }
}  
