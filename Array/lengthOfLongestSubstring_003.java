public class lengthOfLongestSubstring_003 {
    public static void main(String[] args) {
        lengthOfLongestSubstring_003 sol = new lengthOfLongestSubstring_003();
        String s = "abcabcbb";
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println("Length of longest Substring: " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[128];
        for (int i = 0; i < 128; i++) {
            charMap[i] = -1;
        }

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charMap[currentChar] >= left) {
                left = charMap[currentChar] + 1;
            }

            charMap[currentChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
