class Solution {
    public void solve(int[] nums, int target, List<List<Integer>> ans, List<Integer> temp, int i) {
        if (target < 0) {
            return;
        }
        if (i == nums.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        temp.add(nums[i]);
        solve(nums, target - nums[i], ans, temp, i);
        temp.remove(temp.size() - 1);
        solve(nums, target , ans, temp, i + 1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(nums, target, ans, temp, 0);
        return ans;
    }
}
