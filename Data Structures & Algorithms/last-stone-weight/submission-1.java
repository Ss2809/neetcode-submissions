class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if(a >  b){
              pq.offer(a-b);
            }else if(b > a){
                pq.offer(b-a);
            }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
