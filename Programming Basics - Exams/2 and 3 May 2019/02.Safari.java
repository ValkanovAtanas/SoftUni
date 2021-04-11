import java.util.Scanner;

class Safari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double litersNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double priceBeforeDiscount = 100 + 2.1 * litersNeeded;

        if (dayOfWeek.equals("Saturday")) {
            priceBeforeDiscount *= 0.9;
        } else {
            priceBeforeDiscount *= 0.8;
        }

        double difference = Math.abs(budget - priceBeforeDiscount);

        if (priceBeforeDiscount <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv. ", difference);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", difference);
        }
    }
}