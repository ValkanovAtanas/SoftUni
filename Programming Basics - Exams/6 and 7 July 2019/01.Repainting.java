import java.util.Scanner;

class Repainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int thinnerQunatity = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());

        double consumables = ((nylonQuantity + 2) * 1.5) + (paintQuantity * 1.1 * 14.5) + (thinnerQunatity * 5) + 0.4;
        double handymen = 0.3 * consumables;
        double totalExpenses = consumables + handymen * hoursNeeded;

        System.out.printf("Total expenses: %.2f lv.", totalExpenses);

    }
}