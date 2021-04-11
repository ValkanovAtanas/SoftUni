import java.util.Scanner;

class DivideWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber % 2 == 0) {
                p1Counter++;
            }
            if (currentNumber % 3 == 0) {
                p2Counter++;
            }
            if (currentNumber % 4 == 0) {
                p3Counter++;
            }
        }
        double p1 = p1Counter * 1.0 / n * 100;
        double p2 = p2Counter * 1.0 / n * 100;
        double p3 = p3Counter * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%", p3);
    }
}