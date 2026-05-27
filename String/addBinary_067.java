public class addBinary_067 {
    public static void main(String[] args) {
        addBinary_067 sol = new addBinary_067();
        String a = "1010";
        String b = "1011";
        String result = sol.addBinary(a, b);
        System.out.println("Add binary of " + a + " and " + b + " is: " + result);
    }

    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int total = carry;
            if (i >= 0) {
                total += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                total += b.charAt(j) - '0';
                j--;
            }
            res.append(total % 2);
            carry = total / 2;
        }
        return res.reverse().toString();
    }
}
