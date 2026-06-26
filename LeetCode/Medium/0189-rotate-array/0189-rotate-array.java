class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] checks = new int[n];
        for (int i = 0; i < n; i++) {
            checks[(k + i) % n] = nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            nums[i] = checks[i];
        }
    }
}