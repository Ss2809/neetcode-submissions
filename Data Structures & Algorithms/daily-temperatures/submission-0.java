class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0;i < temperatures.length;i++ ){
            int t = temperatures[i];
            while(!st.empty()&& t > temperatures[st.peek()]){
              int idx = st.pop();
              ans[idx] = i-idx;
            }
            st.push(i);
        }
        return ans;
    }
}
