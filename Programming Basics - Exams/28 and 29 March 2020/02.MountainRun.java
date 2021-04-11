import java.util.Scanner;

class MountainRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double delay = 30 * Math.floor((distanceInMeters / 50));
        double time = distanceInMeters * secondsPerMeter + delay;

        if (time < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        } else {
            double difference = time - record;
            System.out.printf("No! He was %.2f seconds slower.", difference);
        }
    }
}