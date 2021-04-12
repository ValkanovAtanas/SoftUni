import java.util.Scanner;

class CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totalTickets = 0;
        int studentTicketsCounter = 0;
        int standardTicketsCounter = 0;
        int kidsTicketsCounter = 0;
        while (!movie.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int currentMovieTicketCounter = 0;
            while (!ticketType.equals("End")) {
                currentMovieTicketCounter++;
                totalTickets++;
                switch (ticketType) {
                    case "student":
                        studentTicketsCounter++;
                        break;
                    case "standard":
                        standardTicketsCounter++;
                        break;
                    case "kid":
                        kidsTicketsCounter++;
                        break;
                }
                if (currentMovieTicketCounter == freeSeats) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double percentage = currentMovieTicketCounter * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentage);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        double percentage1 = studentTicketsCounter * 100.0 / totalTickets;
        double percentage2 = standardTicketsCounter * 100.0 / totalTickets;
        double percentage3 = kidsTicketsCounter * 100.0 / totalTickets;
        System.out.printf("%.2f%% student tickets.%n", percentage1);
        System.out.printf("%.2f%% standard tickets.%n", percentage2);
        System.out.printf("%.2f%% kids tickets.%n", percentage3);
    }
}