import java.util.Scanner;

class EqualSumsEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int firstDigit = i / 100000;
            int secondDigit = i / 10000 % 10;
            int thirdDigit = i / 1000 % 10;
            int fourthDigit = i / 100 % 10;
            int fifthDigit = i / 10 % 10;
            int sixthDigit = i % 10;
            if (firstDigit + thirdDigit + fifthDigit == secondDigit + fourthDigit + sixthDigit) {
                System.out.printf("%d ", i);
            }
        }

    }
}