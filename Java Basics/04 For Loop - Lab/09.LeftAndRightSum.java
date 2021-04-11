import java.util.Scanner;

class LeftAndRightSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= n; i++) {
            sumLeft += Integer.parseInt(scanner.nextLine());
        }
        for (int i = 1; i <= n; i++) {
            sumRight += Integer.parseInt(scanner.nextLine());
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            int difference = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", difference);
        }
    }
}