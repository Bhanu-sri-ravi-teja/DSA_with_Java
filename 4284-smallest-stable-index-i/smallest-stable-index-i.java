class Solution {
    int Min(int i, int[] nums,int n){
        int min = Integer.MAX_VALUE;
        for(int j=i; j<n; j++){
            min = Math.min(min,nums[j]);
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int min;
        int max = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max,nums[i]);
            min = Min(i,nums,n);
            if(max-min<=k){
                res = Math.min(res,i);
            }
        }
        return res == Integer.MAX_VALUE? -1:res;
    }
}