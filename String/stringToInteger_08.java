public class stringToInteger_08 {
    static class Solution {
        public int myAtoi(String s) {
            if (s == null || s.length() == 0) return 0;

            s = s.trim();
            if (s.isEmpty()) return 0;

            int sign = 1;
            int index = 0;

            if (s.charAt(0) == '-') {
                sign = -1;
                index++;
            } else if (s.charAt(0) == '+') {
                index++;
            }

            long res = 0;

            while (index < s.length()) {
                char ch = s.charAt(index);
                if (ch < '0' || ch > '9') break;

                res = res * 10 + (ch - '0');

                if (sign == 1 && res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign == -1 && -res < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

                index++;
            }

            return (int) (res * sign);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testCases = {
                "42",
                "   -042",
                "1337c0d3",
                "0-1",
                "words and 987",
                "-91283472332"
        };

        for (String test : testCases) {
            int result = solution.myAtoi(test);
            System.out.printf("Input: \"%-15s\" -> Output: %d%n", test, result);
        }
    }
}