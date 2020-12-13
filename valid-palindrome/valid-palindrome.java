class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                newString += Character.toLowerCase(s.charAt(i));
            } else if(Character.isDigit(s.charAt(i))) {
                newString += s.charAt(i);
            }
        }
        for(int i = 0; i < newString.length() / 2; i++) {
            if(newString.charAt(i) != newString.charAt(newString.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
