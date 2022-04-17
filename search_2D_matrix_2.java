// TC O(m+n), SC O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = m - 1;
        int j = 0;
        // lower left

        while (i >= 0 && j < n) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }
}

class Solution_2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;

        // upper right

        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (target > matrix[i][j]) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}