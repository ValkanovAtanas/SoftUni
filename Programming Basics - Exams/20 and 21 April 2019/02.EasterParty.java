import java.util.Scanner;

class EasterParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scanner.nextLine());
        double coverPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakePrice = 0.1 * budget;

        if (guestsCount >= 10 && guestsCount <= 15) {
            coverPrice *= 0.85;
        } else if (guestsCount > 15 && guestsCount <= 20) {
            coverPrice *= 0.80;
        } else if (guestsCount > 20) {
            coverPrice *= 0.75;
        }

        double totalPrice = cakePrice + guestsCount * coverPrice;
        double difference = Math.abs(totalPrice - budget);
        if (totalPrice <= budget){
            System.out.printf("It is party time! %.2f leva left.", difference);
        } else {
            System.out.printf("No party! %.2f leva needed.", difference);
        }
    }
}