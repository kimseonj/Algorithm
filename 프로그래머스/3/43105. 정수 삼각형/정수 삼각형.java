class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        for (int i = 1; i < n; i++) {
            // 왼쪽 끝
            triangle[i][0] += triangle[i - 1][0];
            
            // 가운데
            for (int j = 1; j < i; j++) {
                triangle[i][j] += Math.max(
                    triangle[i-1][j-1],
                    triangle[i-1][j]
                );
            }
            
            // 오른쪽
            triangle[i][i] += triangle[i-1][i-1];
        }
        
        int answer = 0;
        for (int value : triangle[n - 1]) {
            answer = Math.max(answer, value);
        }
        
        return answer;
    }
}