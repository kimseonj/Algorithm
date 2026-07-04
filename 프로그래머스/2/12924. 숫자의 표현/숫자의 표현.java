class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int start = 1;
        while(start <= n) {
            // logic
            int sum = n;
            int currentStart = start;
            while (sum > 0) {
                sum -= currentStart;
                currentStart++;
            }
                 
            // count up
            start++;
            if (sum == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}