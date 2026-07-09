class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> seq = new HashMap<>();
        for(int i : nums){
            int val = seq.getOrDefault(i,0)+1;
            seq.put(i,val);
        }
        for(int i : seq.values()){
            if(i>1){
                return true;
            }
        }
        return false;
    }
}