import java.util.Scanner;

class BarcodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int fifthDigitStartNum = startNum % 10;
        int fourthDigitStartNum = startNum / 10 % 10;
        int thirdDigitStartNum = startNum / 100 % 10;
        int secondDigitStartNum = startNum / 1000 % 10;
        int firstDigitStartNum = startNum / 1000;
        int fifthDigitEndNum = endNum % 10;
        int fourthDigitEndNum = endNum / 10 % 10;
        int thirdDigitEndNum = endNum / 100 % 10;
        int secondDigitEndNum = endNum / 1000 % 10;
        int firstDigitEndNum = endNum / 1000;
        for (int i = startNum; i <= endNum; i++) {
            int fifthDigit = i % 10;
            int fourthDigit = i / 10 % 10;
            int thirdDigit = i / 100 % 10;
            int secondDigit = i / 1000 % 10;
            int firstDigit = i / 1000;
            if (firstDigit % 2 == 1 && secondDigit % 2 == 1 && thirdDigit % 2 == 1 && fourthDigit % 2 == 1 && fifthDigit % 2 == 1) {
                if (firstDigit >= firstDigitStartNum && firstDigit <= firstDigitEndNum &&
                        secondDigit >= secondDigitStartNum && secondDigit <= secondDigitEndNum &&
                        thirdDigit >= thirdDigitStartNum && thirdDigit <= thirdDigitEndNum &&
                        fourthDigit >= fourthDigitStartNum && fourthDigit <= fourthDigitEndNum &&
                        fifthDigit >= fifthDigitStartNum && fifthDigit <= fifthDigitEndNum) {
                    System.out.printf(i + " ");
                }
            }
        }
    }
}