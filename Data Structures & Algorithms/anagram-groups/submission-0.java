
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();

        for (String i : strs) {
            char[] temp = i.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(i);
        }

        List<List<String>> finalans = new ArrayList<>();

        for (String i : ans.keySet()) {
            finalans.add(ans.get(i));
        }

        return finalans;
    }
}
