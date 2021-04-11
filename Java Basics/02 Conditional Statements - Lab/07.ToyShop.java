import java.util.Scanner;

class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesNum = Integer.parseInt(scanner.nextLine());
        int dollsNum = Integer.parseInt(scanner.nextLine());
        int bearsNum = Integer.parseInt(scanner.nextLine());
        int minionsNum = Integer.parseInt(scanner.nextLine());
        int trucksNum = Integer.parseInt(scanner.nextLine());
        double toysPrice = puzzlesNum * 2.6 + dollsNum * 3 + bearsNum * 4.1 + minionsNum * 8.2 + trucksNum * 2;
        int toysNum = puzzlesNum + dollsNum + bearsNum + minionsNum + trucksNum;

        if (toysNum >= 50) {
            toysPrice *= 0.75;
        }
        toysPrice *= 0.9;

        if (toysPrice >= tripPrice){
            double moneyLeft = toysPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeeded = tripPrice - toysPrice;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}