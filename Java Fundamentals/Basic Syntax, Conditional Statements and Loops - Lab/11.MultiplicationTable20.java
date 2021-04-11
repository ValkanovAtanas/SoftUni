import java.util.Scanner;

class MultiplicationTable20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int result = 0;
        for (int i = multiplier; i <= 10; i++) {
            result = num * i;
            System.out.printf("%d X %d = %d%n", num, i, result);
        }
        if (multiplier > 10) {
            result = num * multiplier;
            System.out.printf("%d X %d = %d%n", num, multiplier, result);
        }
    }
}