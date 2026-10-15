
class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.isEmpty()) {
            return 0;
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Interval temp : intervals) {
            if (!pq.isEmpty() && pq.peek() <= temp.start) {
                pq.poll();
            }

            pq.offer(temp.end);
        }

        return pq.size();
    }
}