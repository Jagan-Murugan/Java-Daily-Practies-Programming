import java.util.TreeSet;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int answer = Integer.MIN_VALUE;

        for (int top = 0; top < rows; top++) {

            int[] columnSum = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                // Compress rows into column sums
                for (int col = 0; col < cols; col++) {
                    columnSum[col] += matrix[bottom][col];
                }

                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);

                int prefixSum = 0;

                for (int value : columnSum) {

                    prefixSum += value;

                    // Find smallest previous prefix >= prefixSum - k
                    Integer previous = set.ceiling(prefixSum - k);

                    if (previous != null) {
                        int currentSum = prefixSum - previous;
                        answer = Math.max(answer, currentSum);
                    }

                    set.add(prefixSum);
                }
            }
        }

        return answer;
    }
}