class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    
                    while(j<nums2.length){
                        j++;
                        if(j >= nums2.length){
                            nums1[i] = -1;
                            j = nums2.length;
                            break;
                        }else if(nums2[j] > nums1[i]){
                            nums1[i] = nums2[j];
                            j = nums2.length;
                            break;
                        }
                    }
                }
            }
        }
        return nums1;
    }
}