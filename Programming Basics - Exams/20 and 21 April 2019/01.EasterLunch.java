import java.util.Scanner;

class EasterLunch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int easterBreadCount = Integer.parseInt(scanner.nextLine());
        int eggsCartonCount = Integer.parseInt(scanner.nextLine());
        int easterCookieCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = easterBreadCount * 3.2 + eggsCartonCount * 4.35 + easterCookieCount * 5.4 + (eggsCartonCount * 12 * 0.15);
        System.out.printf("%.2f", totalPrice);
    }
}