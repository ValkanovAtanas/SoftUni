import java.util.Scanner;

class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenusCount = Integer.parseInt(scanner.nextLine());
        int fishMenusCount = Integer.parseInt(scanner.nextLine());
        int vegeterianMenusCount = Integer.parseInt(scanner.nextLine());

        double allMenusPrice = chickenMenusCount * 10.35 + fishMenusCount * 12.4 + vegeterianMenusCount * 8.15;
        double totalPrice = allMenusPrice + 0.2 * allMenusPrice + 2.5;

        System.out.printf("Total: %.2f", totalPrice);
    }
}