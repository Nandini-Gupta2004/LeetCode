class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> ls = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        // Find minimum difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < min) {
                min = diff;
            }
        }

        // Store all pairs having minimum difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff == min) {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(arr[i - 1]);
                l.add(arr[i]);
                ls.add(l);
            }
        }

        return ls;
    }
}