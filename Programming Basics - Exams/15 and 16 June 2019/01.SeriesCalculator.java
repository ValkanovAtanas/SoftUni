import java.util.Scanner;

class SeriesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());
        duration *= 1.2;

        double totalTime = Math.ceil(seasonsCount * seriesCount * duration + (seasonsCount * 10));

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",movieName, totalTime);

    }
}