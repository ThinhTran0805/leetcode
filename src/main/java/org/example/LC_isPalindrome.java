package org.example;

public class LC_isPalindrome {
    public static void main(String[] args) {

        LC_isPalindrome solver = new LC_isPalindrome();
        int testNumber = 121;
        boolean result = solver.isPalindrome(testNumber);
        System.out.println("Number " + testNumber + " is Palindrome?\n" + result);
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while ( x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}

