class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String word : words) {
            int i = Integer.parseInt(word);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        return min + " " + max;
    }
}