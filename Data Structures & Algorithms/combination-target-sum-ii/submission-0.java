

class Solution {

    public void solve(int[] candidates, int idx, int target,
                      List<List<Integer>> ans, List<Integer> temp) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        for (int i = idx; i < candidates.length; i++) {

            
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            
            temp.add(candidates[i]);

            
            solve(candidates, i + 1, target - candidates[i], ans, temp);

           
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(candidates, 0, target, ans, temp);

        return ans;
    }
}
