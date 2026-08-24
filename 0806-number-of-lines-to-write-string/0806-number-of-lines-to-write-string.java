class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int width = 0;

        for (int i = 0; i < s.length(); i++) {

            int currWidth = widths[s.charAt(i) - 'a'];

            if (width + currWidth > 100) {
                lines++;
                width = currWidth;
            } else {
                width += currWidth;
            }
        }

        return new int[]{lines, width};
    }
}