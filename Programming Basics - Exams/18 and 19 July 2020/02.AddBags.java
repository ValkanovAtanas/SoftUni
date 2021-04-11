import java.util.Scanner;

class AddBags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double luggagePrice = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        double daysLeft = Double.parseDouble(scanner.nextLine());
        int luggageNum = Integer.parseInt(scanner.nextLine());

        if (luggageWeight < 10) {
            luggagePrice *= 0.2;
        } else if (luggageWeight >= 10 && luggageWeight <= 20) {
            luggagePrice /= 2;
        }

        if (daysLeft > 30) {
            luggagePrice *= 1.1;
        } else if (daysLeft < 7) {
            luggagePrice *= 1.4;
        } else {
            luggagePrice *= 1.15;
        }

        double totalPrice = luggagePrice * luggageNum;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}