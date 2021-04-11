import java.util.Scanner;

class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNumber = scanner.nextLine();
        int number = Integer.parseInt(stringNumber);
        int factorialsSum = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            char a = stringNumber.charAt(i);
            int b = a - 48;
            int digitFactorial = 1;
            for (int j = 2; j <= b; j++) {
                digitFactorial *= j;
            }
            factorialsSum += digitFactorial;
        }
        if (factorialsSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}