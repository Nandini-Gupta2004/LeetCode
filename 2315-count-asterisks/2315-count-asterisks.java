class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insideBar = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '|') {
                insideBar = !insideBar;
            } 
            else if (ch == '*' && !insideBar) {
                count++;
            }
        }

        return count;
    }
}