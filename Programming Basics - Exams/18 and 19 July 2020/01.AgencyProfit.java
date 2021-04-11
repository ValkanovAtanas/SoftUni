import java.util.Scanner;

class AgencyProfit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String airway = scanner.nextLine();
        int adultTicketsNum = Integer.parseInt(scanner.nextLine());
        int kidTicketsNum = Integer.parseInt(scanner.nextLine());
        double adultTicketsPrice = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());
        double kidTicketPrice = 0.3 * adultTicketsPrice;
        double totalPrice = (adultTicketsPrice + serviceTax) * adultTicketsNum + (kidTicketPrice + serviceTax) * kidTicketsNum;
        double profit = 0.2 * (totalPrice);

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airway, profit);

    }
}