 class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int k = 0;

        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            // Put character
            chars[k++] = ch;

            // Put count if greater than 1
            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[k++] = c;
                }
            }
        }

        return k;
    }
}