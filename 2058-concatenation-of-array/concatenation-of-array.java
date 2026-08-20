class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n*2];
        for(int i=0; i<n*2; i++){
            if(i<n){
                arr[i] = nums[i];
            }else{
                arr[i] = nums[i-n];
            }
        }
        return arr;
    }
}