import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {

        ArrayList<String> ls = new ArrayList<>();

        String prev = "";

        for (String str : words) {

            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String curr = new String(ch);

            if (!curr.equals(prev)) {
                ls.add(str);
                prev = curr;
            }
        }

        return ls;
    }
}