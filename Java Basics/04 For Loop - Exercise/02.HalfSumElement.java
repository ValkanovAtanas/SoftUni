import java.util.Scanner;

class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sumOfAllNumbers = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumOfAllNumbers += currentNum;
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        int sumOfOtherNumbers = sumOfAllNumbers - maxNum;

        if (sumOfOtherNumbers == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            int difference = Math.abs(sumOfOtherNumbers - maxNum);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}