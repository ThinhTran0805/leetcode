import java.util.Scanner;

public class climbingStairs_070 {
    public static void main(String[] args) {
        climbingStairs_070 sol = new climbingStairs_070();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of steps (n): ");
        int n = scanner.nextInt();
        int result = sol.climbingStairs(n);
        System.out.println("Number ways to climb: " + result);
        scanner.close();
    }

    public int climbingStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}
