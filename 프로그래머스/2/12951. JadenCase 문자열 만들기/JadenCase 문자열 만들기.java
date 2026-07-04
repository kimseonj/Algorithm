class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isWordStart = true;
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                isWordStart = true;
            } else {
                if (isWordStart) {
                    sb.append(Character.toUpperCase(c));
                    isWordStart = false;
                } else {
                    sb.append(c);
                }
            }
        }
        
        return sb.toString();
    }
}