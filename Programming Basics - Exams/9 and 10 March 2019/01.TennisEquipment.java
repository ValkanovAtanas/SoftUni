import java.util.Scanner;

class TennisEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsCount = Integer.parseInt(scanner.nextLine());
        int shoes = Integer.parseInt(scanner.nextLine());
        double shoesPrice = racketPrice / 6;

        double tennisEquipment = racketsCount * racketPrice + shoes * shoesPrice;
        double otherEquipment = 0.2 * tennisEquipment;

        double djokovicPrice = Math.floor((tennisEquipment + otherEquipment)/8);
        double sponsorsPrice = Math.ceil((tennisEquipment + otherEquipment) * 7/8);
        System.out.printf("Price to be paid by Djokovic %.0f", djokovicPrice);
        System.out.println();
        System.out.printf("Price to be paid by sponsors %.0f", sponsorsPrice);
    }
}