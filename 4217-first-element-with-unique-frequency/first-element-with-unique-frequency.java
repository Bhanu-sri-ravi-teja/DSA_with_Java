class Solution {
    public int firstUniqueFreq(int[] nums){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for (int f : freq.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }

        for (int num : nums) {
            if (freqCount.get(freq.get(num)) == 1) {
                return num;
            }
        }

        return -1;
    }
}