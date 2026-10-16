

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, ans, new ArrayList<>(), nums);

        return ans;
    }

    public void solve(int i, List<List<Integer>> ans, List<Integer> temp, int[] nums) {
        ans.add(new ArrayList<>(temp));

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            temp.add(nums[j]);

            solve(j + 1, ans, temp, nums);

            temp.remove(temp.size() - 1);
        }
    }
}
