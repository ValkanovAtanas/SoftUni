import java.util.Scanner;

class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int seriesDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double freeTime = breakDuration - ((1.0 / 8.0 * 1.0 * breakDuration) + (1.0 / 4.0 * 1.0 * breakDuration));

        if (freeTime >= seriesDuration) {
            double difference = Math.ceil(freeTime - seriesDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, difference);
        } else {
            double difference = Math.ceil(seriesDuration - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, difference);
        }
    }
}