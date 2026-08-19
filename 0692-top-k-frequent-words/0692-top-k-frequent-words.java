class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<words.length;i++)
        mp.put(words[i],mp.getOrDefault(words[i],0)+1);


        // Put all words into list
        List<String> list = new ArrayList<>(mp.keySet());

        // Sort by frequency (descending)
        // If frequency is same, alphabetical order
        Collections.sort(list, (a, b) -> {
            if (mp.get(a) != mp.get(b)) {
                return mp.get(b) - mp.get(a);
            }
            return a.compareTo(b);
        });

        // Take first k words
        return list.subList(0, k);

    }
}