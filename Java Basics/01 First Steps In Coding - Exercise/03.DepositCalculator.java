import java.util.Scanner;

class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double sum = depositSum + ((depositSum * (interest/ 100)) / 12 * depositTerm);
        System.out.println(sum);
    }
}