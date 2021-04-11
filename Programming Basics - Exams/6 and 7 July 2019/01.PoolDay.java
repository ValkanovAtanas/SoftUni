import java.util.Scanner;

class PoolDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = Integer.parseInt(scanner.nextLine());
        double entryFee = Double.parseDouble(scanner.nextLine());
        double sunBedPrice = Double.parseDouble(scanner.nextLine());
        double sunUmbrellaPrice = Double.parseDouble(scanner.nextLine());
        double sunUmbrellaNum = Math.ceil(peopleNum / 2.0);
        double sunBedNum = Math.ceil(0.75 * peopleNum);

        double totalPrice = (sunBedPrice * sunBedNum + sunUmbrellaNum * sunUmbrellaPrice) + entryFee * peopleNum;

        System.out.printf("%.2f lv.", totalPrice );
    }
}