import java.util.Scanner;

class Volleyball {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String leapOrNormal = scanner.nextLine();
        int numOfHolidays = Integer.parseInt(scanner.nextLine());
        int weekendTravelNum = Integer.parseInt(scanner.nextLine());

        double allSaturdaysHePlays = (48 -  weekendTravelNum) * 0.75;
        double allSundaysHePlays = 2 * 1.0 / 3 * 1.0 * numOfHolidays;
        double totalPlay = allSaturdaysHePlays + allSundaysHePlays + weekendTravelNum;

        switch (leapOrNormal) {
            case "leap":
                totalPlay *= 1.15;
        }
        totalPlay = Math.floor(totalPlay);
        System.out.printf("%.0f", totalPlay);
    }
}