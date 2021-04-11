import java.util.Scanner;

class CharityCampaign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int pastryChefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());
        double cakesPrice = cakes * 45;
        double wafflesPrice = waffles * 5.8;
        double pancakesPrice = pancakes * 3.2;
        double totalPrice = (cakesPrice + wafflesPrice + pancakesPrice) * days * pastryChefs;
        double finalSum = totalPrice * 7 / 8;
        System.out.printf("%.2f", finalSum);
    }
}
