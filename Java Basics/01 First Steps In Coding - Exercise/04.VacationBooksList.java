import java.util.Scanner;

class VacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysForReading = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = pages / pagesPerHour;
        System.out.println(hoursNeeded / daysForReading);

    }
}