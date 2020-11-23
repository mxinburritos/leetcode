class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        ArrayList<String> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            rows.add("");
        }
        for(int i = 0; i < s.length(); i++) {
            int currRow = (i) % (2*numRows-2);
            System.out.print(s.charAt(i));
            if(currRow < numRows) {
                rows.set(currRow, rows.get(currRow) + s.charAt(i));
                System.out.println(currRow);
            } else {
                System.out.print("hey");
                System.out.println(numRows-(currRow%(numRows-1))-1);
                rows.set(numRows - (currRow % (numRows-1)) - 1, rows.get(numRows - (currRow % (numRows-1))-1) + s.charAt(i));
            }
        }
        String ans = "";
        for (String row : rows) {
            ans += row;
        }
        return ans;
    }
}
