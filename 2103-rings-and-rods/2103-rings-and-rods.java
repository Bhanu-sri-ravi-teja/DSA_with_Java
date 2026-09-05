class Solution {
    public int countPoints(String rings) {
        Map<Integer,String> rods = new HashMap<>();
        char prev;
        for(int i=1; i<rings.length(); i= i+2){
            prev = rings.charAt(i-1);
            int rodno = rings.charAt(i);
            if(!rods.containsKey(rodno)){
                rods.put(rodno,String.valueOf(prev));
            }else{
                String tempStr = rods.get(rodno);
                if(!tempStr.contains(String.valueOf(prev))){
                    tempStr = tempStr + String.valueOf(prev);
                    rods.put(rodno,tempStr);
                }
            }
        }
        int resCount = 0;
        for(String value : rods.values()){
            System.out.println(value);
            if(value.contains("R")&&value.contains("G")&&value.contains("B")){
                resCount++;
            }
        }
        return resCount;
    }
}