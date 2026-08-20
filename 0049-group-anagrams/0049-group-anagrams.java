class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String newStr = new String(charArr);
            if(!map.containsKey(newStr)){
                map.put(newStr,new ArrayList<>());
            }
            map.get(newStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}