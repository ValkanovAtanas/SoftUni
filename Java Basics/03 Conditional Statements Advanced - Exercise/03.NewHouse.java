import java.util.Scanner;

class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (flower) {
            case "Roses":
                price = 5;
                if (quantity > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80;
                if (quantity > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80;
                if (quantity > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3;
                if (quantity < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (quantity < 80) {
                    price *= 1.2;
                }
                break;
        }
        double totalMoneyForFlowers = price * quantity;
        double difference = Math.abs(budget - totalMoneyForFlowers);
        if (totalMoneyForFlowers <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",quantity,flower, difference);
        } else if (totalMoneyForFlowers > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}