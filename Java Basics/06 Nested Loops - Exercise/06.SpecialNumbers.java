import java.util.Scanner;

class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1111; i <= 9999; i++) {
            int firstDigit = i / 1000;
            int secondDigit = i / 100 % 10;
            int thirdDigit = i / 10 % 10;
            int fourthDigit = i % 10;
            if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0 && fourthDigit != 0) {
                if (n % firstDigit == 0 && n % secondDigit == 0 && n % thirdDigit == 0 && n % fourthDigit == 0) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}