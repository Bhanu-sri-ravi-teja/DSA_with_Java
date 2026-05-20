class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int j = i;
            int k = i;
            res[i] = 0;
            
            while(k >= 0){
                if(j >= 0 && A[k] == B[j]){
                    res[i] = res[i] + 1;
                    k--;
                    j = i;
                }else{
                    j--;
                    if(j < 0){
                        k--;
                        j = i;
                    }
                }
            }
        }
        return res;
    }
}