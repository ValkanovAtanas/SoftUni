import java.util.Scanner;

class Skeleton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        int secondsPer100Meters = Integer.parseInt(scanner.nextLine());

        int controlTimeInSeconds = controlMinutes * 60 + controlSeconds;

        double personalTime = secondsPer100Meters * distanceInMeters / 100 - (distanceInMeters / 120 * 2.5);

        if (personalTime <= controlTimeInSeconds){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", personalTime);
        } else {
            double difference = personalTime - controlTimeInSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.", difference);
        }
    }
}