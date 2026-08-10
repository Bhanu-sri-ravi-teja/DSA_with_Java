class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        int[] r = new int[m * n];
        int[] c = new int[m * n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = mat[i][j];
                r[value - 1] = i;
                c[value - 1] = j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i] - 1;
            int rowIndex = r[value];
            int colIndex = c[value];

            row[rowIndex]++;
            col[colIndex]++;

            if (row[rowIndex] == n || col[colIndex] == m) {
                return i;
            }
        }

        return -1;
    }
}