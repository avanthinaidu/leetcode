public class Solution {
    public int totalNQueens(int n) {
        return solveNQueens(n, 0, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
    }

    private int solveNQueens(int n, int row, boolean[] cols, boolean[] d1, boolean[] d2) {
        if (row == n) return 1;
        int count = 0;
        for (int col = 0; col < n; col++) {
            int id1 = col - row + n;
            int id2 = col + row;
            if (cols[col] || d1[id1] || d2[id2]) continue;
            cols[col] = d1[id1] = d2[id2] = true;
            count += solveNQueens(n, row + 1, cols, d1, d2);
            cols[col] = d1[id1] = d2[id2] = false;
        }
        return count;
    }
}
