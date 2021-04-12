import java.util.Scanner;

class FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double boatRent = 0;

        if (season.equals("Spring")) {
            boatRent = 3000;
        } else if (season.equals("Summer")) {
            boatRent = 4200;
        } else if (season.equals("Autumn")) {
            boatRent = 4200;
        } else if (season.equals("Winter")) {
            boatRent = 2600;
        }

        if (fishermen <= 6) {
            boatRent *= 0.9;
        } else if (fishermen >= 7 && fishermen <= 11) {
            boatRent *= 0.85;
        } else if (fishermen >= 12) {
            boatRent *= 0.75;
        }

        switch (season) {
            case "Summer":
            case "Spring":
            case "Winter":
                if (fishermen % 2 == 0) {
                    boatRent *= 0.95;
                }
                break;
        }
        double difference = Math.abs(budget - boatRent);
        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else if (budget < boatRent) {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }
    }
}