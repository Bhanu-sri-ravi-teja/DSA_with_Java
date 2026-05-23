public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        sumMap.put(0, 1);
        
        int currentSum = 0;
        int totalSubarrays = 0;
        
        for (int num : nums) {
            currentSum += num;
            if (sumMap.containsKey(currentSum - k)) {
                totalSubarrays += sumMap.get(currentSum - k);
            }
            sumMap.put(currentSum, sumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return totalSubarrays;
    }
}