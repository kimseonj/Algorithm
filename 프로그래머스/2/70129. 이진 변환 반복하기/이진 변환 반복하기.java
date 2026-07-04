class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (!s.equals("1")) {
            // 0제거
            answer[1] += s.length();
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            answer[1] -= count;
            
            // 이진수 변환
            s = Integer.toBinaryString(count);
            
            // count up
            answer[0]++;
        }
        
        
        return answer;
    }
}