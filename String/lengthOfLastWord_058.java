public class lengthOfLastWord_058 {
    public static void main(String[] args) {
        lengthOfLastWord_058 sol = new lengthOfLastWord_058();
        String s = "Hello World";
        int result = sol.lengthOfLastWord(s);
        System.out.println("Length of last word is: " + result);
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int endIndex = i + 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        int startIndex = i + 1;

        String word = s.substring(startIndex, endIndex);
        System.out.println("The last word is: " + word);
        return length;
    }
}
