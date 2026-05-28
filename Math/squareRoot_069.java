import java.util.Scanner;

public class squareRoot_069 {
    //Binary Search
    public static void main(String[] args) {
        squareRoot_069 sol = new squareRoot_069();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = scanner.nextInt();
        int result = sol.sqrt(x);
        System.out.println("Square root of: " + x + " is: " + result);
        scanner.close();
    }

    public int sqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 2;
        int right = x/2;

        while (left <= right) {
            int mid = left + (right - left)/2;
            long num = (long) mid * mid;
            if (num == x) {
                return mid;
            } else if (num < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
