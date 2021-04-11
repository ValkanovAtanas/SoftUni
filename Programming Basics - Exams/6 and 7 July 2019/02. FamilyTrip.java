import java.util.Scanner;

class FamilyTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        double extraCostsPercentage = Double.parseDouble(scanner.nextLine());

        if (nightsCount > 7){
            priceForNight *= 0.95;
        }
        double extraCostsPrice = extraCostsPercentage / 100 * budget;
        double totalPrice = extraCostsPrice + nightsCount * priceForNight;
        double difference = Math.abs(totalPrice - budget);
        if (totalPrice <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", difference);
        } else {
            System.out.printf("%.2f leva needed.", difference);
        }
    }
}