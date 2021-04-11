import java.util.Scanner;

class EasterBakery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsBox = Integer.parseInt(scanner.nextLine());
        int yeastBox = Integer.parseInt(scanner.nextLine());
        double sugarPrice = 0.75 * flourPrice;
        double eggsBoxPrice = 1.1 * flourPrice;
        double yeastPrice = 0.2 * sugarPrice;

        double totalPrice = flourKg * flourPrice + sugarKg * sugarPrice + eggsBox * eggsBoxPrice + yeastBox * yeastPrice;
        System.out.printf("%.2f", totalPrice);
    }
}