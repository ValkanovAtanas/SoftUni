import java.util.Scanner;

class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (days > 14) {
                    apartmentPrice *= 0.9;
                }
                if (days > 7 && days <= 14) {
                    studioPrice *= 0.95;
                } else if (days > 14) {
                    studioPrice *= 0.7;
                }
                break;

            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (days > 14) {
                    studioPrice *= 0.8;
                    apartmentPrice *= 0.9;
                }
                break;

            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                if (days > 14) {
                    apartmentPrice *= 0.9;
                }
                break;
        }
        double totalApartmentPrice = days * apartmentPrice;
        double totalStudioPrice = days * studioPrice;

        System.out.printf("Apartment: %.2f lv.%n", totalApartmentPrice);
        System.out.printf("Studio: %.2f lv.", totalStudioPrice);
    }
}