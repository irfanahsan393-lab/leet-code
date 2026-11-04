class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        String max = s;
        String min = s;
        char maxDigit = ' ';
        char minDigit = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxDigit = c;
                break;
            }
        }
        if (maxDigit != ' ') {
            max = s.replace(maxDigit, '9');
        }
        min = s.replace(minDigit, '0');
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}