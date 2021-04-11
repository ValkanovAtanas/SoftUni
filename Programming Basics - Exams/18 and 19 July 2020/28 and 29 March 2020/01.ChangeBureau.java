import java.util.Scanner;

class ChangeBureau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoinsNum = Integer.parseInt(scanner.nextLine());
        double chineeseYouanNum = Double.parseDouble(scanner.nextLine());
        double convertingTax = Double.parseDouble(scanner.nextLine());

        double bitcoinPrice = 1168;
        double dollarPrice = 1.76;
        double chineeseYouanPrice = 0.15 * dollarPrice;

        double moneyInLeva = bitcoinPrice * bitcoinsNum + chineeseYouanPrice * chineeseYouanNum;
        double moneyInEur = (moneyInLeva / 1.95) *( 1 - (convertingTax / 100));

        System.out.printf("%.2f", moneyInEur);
    }
}