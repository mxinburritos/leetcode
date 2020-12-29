class Solution {
    public int climbStairs(int n) {
        return climbStairs(n, new int[n + 1]);
    }
    
    public int climbStairs(int n, int[] memo) {
        if(n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        if(memo[n] == 0) {
            memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        }
        return memo[n];
    }
}
