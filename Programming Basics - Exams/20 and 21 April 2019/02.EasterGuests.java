import java.util.Scanner;

class EasterGuests {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBreadCount = Math.ceil(guestsCount * 1.0 / 3);
        double easterBreadPrice = easterBreadCount * 4;
        double eggsCount = guestsCount * 2;
        double eggsPrice = eggsCount * 0.45;
        double totalPrice = easterBreadPrice + eggsPrice;
        double difference = Math.abs(totalPrice - budget);
        if (totalPrice <= budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBreadCount, eggsCount);
            System.out.printf("He has %.2f lv. left.", difference);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", difference);
        }
    }
}