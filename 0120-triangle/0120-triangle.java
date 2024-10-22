import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        
        // Start from the second last row and move upwards to the top
        for (int row = triangle.size() - 2; row >= 0; row--) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                // Update the current cell with the sum of the cell and the minimum of the two adjacent cells in the row below
                int currentVal = triangle.get(row).get(col);
                int below = triangle.get(row + 1).get(col);
                int belowRight = triangle.get(row + 1).get(col + 1);
                int minPathSum = currentVal + Math.min(below, belowRight);
                triangle.get(row).set(col, minPathSum);
            }
        }
        
        // The top element now contains the minimum path sum
        return triangle.get(0).get(0);
    }
}
