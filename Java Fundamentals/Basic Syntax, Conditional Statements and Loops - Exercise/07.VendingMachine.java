import java.util.Scanner;

class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double coinsSum = 0;

        while (!input.equals("Start")) {
            double coinInserted = Double.parseDouble(input);
            if (coinInserted == 2 || coinInserted == 0.1 || coinInserted == 0.2 || coinInserted == 0.5 || coinInserted == 1) {
                coinsSum += coinInserted;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinInserted);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            double currProdPrice = 0;
            boolean isProductValid = true;
            boolean isThereEnoughMoney = true;
            if (input.equals("Nuts")) {
                currProdPrice = 2;
            } else if (input.equals("Water")) {
                currProdPrice = 0.7;
            } else if (input.equals("Crisps")) {
                currProdPrice = 1.5;
            } else if (input.equals("Soda")) {
                currProdPrice = 0.8;
            } else if (input.equals("Coke")) {
                currProdPrice = 1;
            } else {
                System.out.println("Invalid product");
                isProductValid = false;
            }
            if (isProductValid) {
                if (currProdPrice > coinsSum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.printf("Purchased %s%n", input);
                    coinsSum -= currProdPrice;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", coinsSum);
    }
}