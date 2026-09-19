class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesRow = 0;
        int maxOnes = 0;
        for(int i=0; i<mat.length; i++){
            int rowOnesCount = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    rowOnesCount++;
                }
            }
            if(maxOnes<rowOnesCount){
                maxOnes = rowOnesCount;
                maxOnesRow = i;
            }
        }
        return new int[]{maxOnesRow,maxOnes};
    }
}