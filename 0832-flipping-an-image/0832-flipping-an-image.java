class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int colums = image[0].length;
        for(int i=0; i<rows; i++){
            int right = colums-1;
            int left = 0;
            while(right>=left){
                int temp = image[i][right];
                if(image[i][left] == 1){
                    image[i][right] = 0;
                }else{
                    image[i][right] = 1;
                }
                if(temp == 1){
                    image[i][left] = 0;
                }else{
                    image[i][left] = 1;
                }
                right--;
                left++;
            }
        } 
        return image;
    }
}