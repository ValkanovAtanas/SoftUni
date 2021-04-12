import java.util.Scanner;

class SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int primeNumSum = 0;
        int nonPrimeSum = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);
            int counter = 0;
            if (number < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primeNumSum += number;
            } else {
                nonPrimeSum += number;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}