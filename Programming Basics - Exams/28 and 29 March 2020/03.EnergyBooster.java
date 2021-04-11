import java.util.Scanner;

class EnergyBooster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56;
                } else {
                    price = 5 * 28.7;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                } else {
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10;
                } else {
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                } else {
                    price = 5 * 15.20;
                }
                break;
        }
        price *= count;

        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price /= 2;
        }

        System.out.printf("%.2f lv.", price);
    }
}