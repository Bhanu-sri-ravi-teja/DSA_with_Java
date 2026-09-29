class Solution {
    public String largestGoodInteger(String num) {
        if (num.length() < 3) return "";

        int maxRes = -1;

        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i - 1) == num.charAt(i) &&
                num.charAt(i) == num.charAt(i + 1)) {

                maxRes = Math.max(maxRes, num.charAt(i) - '0');
            }
        }

        if (maxRes == -1) return "";

        return "" + maxRes + maxRes + maxRes;
    }
}