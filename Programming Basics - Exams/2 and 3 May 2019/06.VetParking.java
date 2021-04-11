import java.util.Scanner;

class VetParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursCount = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;

        for (int currDay = 1; currDay <= daysCount; currDay++) {
            double priceForDay = 0;
            for (int currHour = 1; currHour <= hoursCount; currHour++) {
                if (currDay % 2 == 0 && currHour % 2 == 1) {
                    priceForDay += 2.5;
                } else if (currDay % 2 == 1 && currHour % 2 == 0) {
                    priceForDay += 1.25;
                } else {
                    priceForDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", currDay, priceForDay);
            totalMoney += priceForDay;
        }
        System.out.printf("Total: %.2f leva", totalMoney);
    }
}