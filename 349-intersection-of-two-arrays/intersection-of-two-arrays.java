class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> values = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            values.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(values.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }            
        }
        int[] result = new int[resultSet.size()];
        int i =0;
        for (int item : resultSet) {
            result[i++] = item;
        }
        return result;
    }
}