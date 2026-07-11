import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int aIndex = 0;
        int score = 0;

        for (int b : B) {
            // 현재 B 카드로 가장 작은 남은 A 카드를 이길 수 있다면
            if (b > A[aIndex]) {
                score++;
                aIndex++;

                // 모든 A를 이겼다면 종료
                if (aIndex == A.length) {
                    break;
                }
            }
        }

        return score;
    }
}