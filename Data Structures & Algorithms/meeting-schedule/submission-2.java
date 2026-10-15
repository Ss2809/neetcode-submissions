

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

       intervals.sort((a, b) -> a.start - b.start);
       if(intervals.size() == 0){
        return true;
       }
        int last = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);

            if (last > current.start) {
                return false;
            } else {
                last = current.end;
            }
        }

        return true;
    }
}