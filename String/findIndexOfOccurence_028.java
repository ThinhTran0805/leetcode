public class findIndexOfOccurence_028 {
    public static void main(String[] args) {
        findIndexOfOccurence_028 sol = new findIndexOfOccurence_028();
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = sol.findIndex(haystack, needle);
        System.out.println(result);
    }

    public int findIndex(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int limit = haystack.length() - needle.length();

        for (int i = 0; i <= limit; i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;

        //indexOf
//        return haystack.indexOf(needle);
    }
}
