import java.util.HashMap;

public class Approach2_Hashmap_003 {
    public static void main(String[] args) {
        Approach2_Hashmap_003 sol = new Approach2_Hashmap_003();
        String s = "abcabcbb";
        int result = sol.approachHashmap(s);
        System.out.println("Length of longest Substring: " + result);
    }

    public int approachHashmap(String s) {
        int n = s.length();
        int maxLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar));
            }

            maxLength = Math.max(maxLength, right - left + 1);
            map.put(currentChar, right + 1);
        }
        return maxLength;
    }
}
