import java.util.Scanner;

class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double decorPrice = 0.1 * budget;

        if (statistsCount > 150){
            clothesPrice *= 0.9;
        }
        clothesPrice *= statistsCount;

        double totalPrice = clothesPrice + decorPrice;

        if (totalPrice <= budget){
            System.out.println("Action!");
            double difference = budget - totalPrice;
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            double difference = totalPrice - budget;
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}