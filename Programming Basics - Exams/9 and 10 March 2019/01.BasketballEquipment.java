import java.util.Scanner;

class BasketballEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainingTax = Integer.parseInt(scanner.nextLine());
        double shoesPrice = 0.6 * trainingTax;
        double clothesPrice = 0.8 * shoesPrice;
        double ballPrice = clothesPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalExpenses = trainingTax + shoesPrice + clothesPrice + ballPrice + accessoriesPrice;
        System.out.printf("%.2f", totalExpenses);
    }
}