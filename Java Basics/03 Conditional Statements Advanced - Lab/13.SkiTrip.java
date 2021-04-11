import java.util.Scanner;

class SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nights = Integer.parseInt(scanner.nextLine()) - 1;
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        double pricePerNight = 0;

        switch (roomType) {
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":
                if (nights < 9) {
                    pricePerNight = 0.7 * 25;
                } else if (nights >= 9 && nights <= 14) {
                    pricePerNight = 0.65 * 25;
                } else  if (nights > 14) {
                    pricePerNight = 12.5;
                }
                break;
            case "president apartment":
                if (nights < 9) {
                    pricePerNight = 0.9 * 35;
                } else if (nights >= 9 && nights <= 14) {
                    pricePerNight = 0.85 * 35;
                } else  if (nights > 14) {
                    pricePerNight = 0.8 * 35;
                }
                break;
        }
        if (feedback.equals("positive")){
            pricePerNight *= 1.25;
        } else {
            pricePerNight *= 0.9;
        }
        double totalPrice = pricePerNight * nights;
        System.out.printf("%.2f", totalPrice);
    }
}