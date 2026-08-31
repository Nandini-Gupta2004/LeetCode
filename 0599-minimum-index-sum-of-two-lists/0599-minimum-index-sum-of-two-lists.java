class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> mp = new HashMap<>();

        // Store restaurant and its index from list1
        for (int i = 0; i < list1.length; i++) {
            mp.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();

        // Check list2
        for (int i = 0; i < list2.length; i++) {

            if (mp.containsKey(list2[i])) {

                int sum = i + mp.get(list2[i]);

                if (sum < minSum) {
                    minSum = sum;
                    ans.clear();
                    ans.add(list2[i]);
                }
                else if (sum == minSum) {
                    ans.add(list2[i]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }
}