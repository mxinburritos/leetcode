class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        } else {
            return say(countAndSay(n-1));
        }
    }
    
    public String say(String n) {
        
        char currLet = n.charAt(0);
        int count = 0;
        String ans = "";
        System.out.print(n + " ");
        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == currLet) {
                count++;
            } else {
                System.out.print(count + " " + currLet + " ");
                ans = ans + String.valueOf(count) + currLet;
                currLet = n.charAt(i);
                count = 1;
            }
        }
        ans = ans + Integer.toString(count) + currLet;
        
        System.out.println(ans);
        return ans;
    }
}
