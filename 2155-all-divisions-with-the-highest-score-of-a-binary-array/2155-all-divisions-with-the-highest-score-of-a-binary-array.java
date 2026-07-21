class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int totalOnes = 0;
        for (int num : nums) {
            if (num == 1) totalOnes++;
        }

        int leftZeros = 0;
        int rightOnes = totalOnes;
        int maxScore = -1;

        for (int i = 0; i <= nums.length; i++) {
            int score = leftZeros + rightOnes;

            if (score > maxScore) {
                maxScore = score;
                ans.clear();
                ans.add(i);
            } else if (score == maxScore) {
                ans.add(i);
            }

            if (i < nums.length) {
                if (nums[i] == 0)
                    leftZeros++;
                else
                    rightOnes--;
            }
        }

        return ans;
    }
}