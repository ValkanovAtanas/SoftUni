import java.util.Scanner;

class SuppliesForSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensNum = Integer.parseInt(scanner.nextLine());
        int markersNum = Integer.parseInt(scanner.nextLine());
        double detergentLiters = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double totalPrice = (1 - (discount / 100)) * (pensNum * 5.8 + markersNum * 7.2 + detergentLiters * 1.2);
        System.out.printf("%.3f", totalPrice);
    }
}