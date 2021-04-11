import java.util.Scanner;

class OddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double oddMin = 1000;
        double oddMax = -1000;
        double evenMin = 1000;
        double evenMax = -1000;

        for (int i = 1; i <= n; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 1) {
                oddSum += currentNum;
                if (currentNum > oddMax) {
                    oddMax = currentNum;
                }
                if (currentNum < oddMin) {
                    oddMin = currentNum;
                }
            } else {
                evenSum += currentNum;
                if (currentNum > evenMax) {
                    evenMax = currentNum;
                }
                if (currentNum < evenMin) {
                    evenMin = currentNum;
                }
            }
        }
        if (n == 0) {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        if (n == 1 || n == 0) {
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}