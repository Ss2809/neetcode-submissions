class Solution {
    public void subset(int[] nums, int i, List<List<Integer>>ans, List<Integer>temp ) {
      if(i == nums.length){
        ans.add(new ArrayList<>(temp));
        return;
      }
       temp.add(nums[i]);
       subset(nums, i+1, ans, temp);
       temp.remove(temp.size()-1);
       subset(nums, i+1, ans, temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        subset(nums, 0, ans, temp);
        return ans;
    }
}
