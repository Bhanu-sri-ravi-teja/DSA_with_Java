class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            int seq = map.getOrDefault(num,0);
            seq++;
            map.put(num,seq);
        }
        int highestElement = 0;
        int highestValue = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > highestValue){
                highestValue = value;
                highestElement = key;
                
            }
        }
        return highestElement;
    }
}