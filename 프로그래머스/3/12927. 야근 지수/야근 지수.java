import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : works) {
            pq.offer(i);
        }
        
        for (int i = 0; i < n; i++) {
            pq.offer(pq.poll() - 1);
        }
        
        long answer = 0;
        for (int i : pq) {
            if (i > 0 ) answer += Math.pow(i, 2);
        }
        
        return answer;
    }
}