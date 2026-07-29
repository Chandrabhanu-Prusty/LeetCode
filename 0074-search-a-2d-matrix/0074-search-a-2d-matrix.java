class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 0 || cols == 0) return false;

        int lo = 0, hi = rows * cols - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int r   = mid / cols;      // map 1‑D index to row
            int c   = mid % cols;      // map 1‑D index to column
            if (matrix[r][c] == target) return true;
            if (matrix[r][c] < target) lo = mid + 1;
            else                       hi = mid - 1;
        }
        return false;
    }
}