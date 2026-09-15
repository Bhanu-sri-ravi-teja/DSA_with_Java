class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> candies = new HashSet<>();
        for(int x : candyType){
            candies.add(x);
        }
        int n = candyType.length/2;
        if(n < candies.size()){
            return n;
        }
        return candies.size();
    }
}