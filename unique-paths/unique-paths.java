class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(m, n, new int[m][n]);
    }
    
    
    public int uniquePaths(int m, int n, int[][] memo) {
        if(m == 1 && n == 1) {
            return 1;
        }
        if(memo[m - 1][n - 1] == 0) {
            memo[m - 1][n - 1] = (m > 1 ? uniquePaths(m - 1, n, memo) : 0) + (n > 1 ? uniquePaths(m, n - 1, memo) : 0);
        }
        return memo[m - 1][n - 1];
    }
}
