import java.util.Scanner;

class FruitMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasWeight = Double.parseDouble(scanner.nextLine());
        double orangesWeight = Double.parseDouble(scanner.nextLine());
        double raspberriesWeight = Double.parseDouble(scanner.nextLine());
        double strawberriesWeight = Double.parseDouble(scanner.nextLine());
        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = 0.6 * raspberriesPrice;
        double bananasPrice = 0.2 * raspberriesPrice;
        double totalPrice = strawberriesPrice * strawberriesWeight + raspberriesPrice * raspberriesWeight + orangesPrice * orangesWeight + bananasPrice * bananasWeight;
        System.out.printf("%.2f", totalPrice);
    }
}