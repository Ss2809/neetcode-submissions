class Solution {
    public void solve(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] vis ){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(vis[i]){
                continue;
            }
            temp.add(nums[i]);
            vis[i] = true;
            solve(nums, ans, temp, vis);
            temp.remove(temp.size()-1);
            vis[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        solve(nums,  ans, temp, vis);
        return ans;
    }
}
