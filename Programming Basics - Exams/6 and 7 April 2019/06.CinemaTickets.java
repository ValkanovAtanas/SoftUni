import java.util.Scanner;

class CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int kidsTicketCounter = 0;
        int standardTicketCounter = 0;
        int studentTicketCounter = 0;

        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int ticketsForCurrProjection = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                ticketsForCurrProjection++;
                if (ticketType.equals("student")) {
                    studentTicketCounter++;
                } else if (ticketType.equals("standard")) {
                    standardTicketCounter++;
                } else {
                    kidsTicketCounter++;
                }
                if (ticketsForCurrProjection == freeSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double percentageFull = ticketsForCurrProjection * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentageFull);

            movie = scanner.nextLine();
        }
        int totalTickets = kidsTicketCounter + standardTicketCounter + studentTicketCounter;
        double kidsTicketsPercentage = kidsTicketCounter * 1.0 / totalTickets * 100;
        double standardTicketsPercentage = standardTicketCounter * 1.0 / totalTickets * 100;
        double studentTicketsPercentage = studentTicketCounter * 1.0 / totalTickets * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTicketsPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidsTicketsPercentage);
    }
}