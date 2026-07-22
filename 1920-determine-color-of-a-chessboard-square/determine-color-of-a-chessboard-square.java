class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        int charNumb = c -'a' + 1;
        if(charNumb%2 == 0 && coordinates.charAt(1)%2 == 0){
            return false;
        }else if(charNumb%2 != 0 && coordinates.charAt(1)%2 != 0){
            return false;
        }
        return true;
    }
}