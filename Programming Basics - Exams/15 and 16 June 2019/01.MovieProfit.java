import java.util.Scanner;

class SeriesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double cinemaProfit = Double.parseDouble(scanner.nextLine());

        double profit = (daysCount * ticketsCount * ticketPrice) * (1 - cinemaProfit / 100);

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, profit);

    }
}