class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int count = 0;
        for(int num : A) {
            if(num % 2 == 0) {
                ans[count] = num;
                count++;
            }
        }
        for(int num : A) {
            if(num % 2 == 1) {
                ans[count] = num;
                count++;
            }
        }
        return ans;
    }
}
