import java.util.Scanner;

class GodzillaVsKong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int stuntMen = Integer.parseInt(scanner.nextLine());
        double stuntMenClothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = 0.1 * budget;

        if (stuntMen > 150) {
            stuntMenClothesPrice *= 0.9;
        }

        double totalPrice = stuntMen * stuntMenClothesPrice + decorPrice;
        double difference = Math.abs(totalPrice - budget);
        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}