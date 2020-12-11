class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int minLength = Integer.MAX_VALUE;
        if(strs.length == 0) {
            return "";
        }
        for(String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }
        outLoop:
        for(int i = 0; i < minLength; i++) {
            String comp = strs[0].substring(0,i+1);
            for(String str : strs) {
                if(!comp.equals(str.substring(0,i+1))) {
                    break outLoop;
                }
            }
            ans = comp;
        }
        return ans;
    }
}
