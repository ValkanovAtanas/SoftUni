import java.util.Scanner;

class TouristShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        int productsCounter = 0;
        double totalPriceOfProducts = 0;
        boolean isBudgetEnough = true;

        while (!product.equals("Stop")) {
            productsCounter++;
            double productPrice = Double.parseDouble(scanner.nextLine());
            if (productsCounter % 3 == 0) {
                productPrice /= 2;
            }
            if (productPrice > budget) {
                double difference = productPrice - budget;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!%n", difference);
                isBudgetEnough = false;
                break;
            } else {
                totalPriceOfProducts += productPrice;
            }
            if (isBudgetEnough == true) {
                product = scanner.nextLine();
                budget -= productPrice;
            }
        }
        if (isBudgetEnough == true) {
            System.out.printf("You bought %d products for %.2f leva.", productsCounter, totalPriceOfProducts);
        }
    }
}