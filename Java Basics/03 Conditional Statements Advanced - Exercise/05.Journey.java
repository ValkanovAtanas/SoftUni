import java.util.Scanner;

class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spentMoney = 0;

        if (budget <= 100) {
            String destination = "Bulgaria";
            if (season.equals("summer")) {
                spentMoney = 0.3 * budget;
                String accomodation = "Camp";
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", accomodation, spentMoney);
            } else if (season.equals("winter")) {
                spentMoney = 0.7 * budget;
                String accomodation = "Hotel";
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", accomodation, spentMoney);
            }
        } else if (budget > 100 && budget <= 1000) {
            String destination = "Balkans";
            if (season.equals("summer")) {
                spentMoney = 0.4 * budget;
                String accomodation = "Camp";
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", accomodation, spentMoney);
            } else if (season.equals("winter")) {
                spentMoney = 0.8 * budget;
                String accomodation = "Hotel";
                System.out.printf("Somewhere in %s%n", destination);
                System.out.printf("%s - %.2f", accomodation, spentMoney);
            }
        } else if (budget > 1000) {
            String destination = "Europe";
            spentMoney = 0.9 * budget;
            String accomodation = "Hotel";
            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f", accomodation, spentMoney);
        }
    }
}