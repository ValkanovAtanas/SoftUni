import java.util.Scanner;

class CleverLily {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyCounter = 0;
        double moneyForBirthday = 0;
        double moneyForBirthdaySum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 1) {
                toyCounter ++;
            } else {
                moneyForBirthday += 10;
                moneyForBirthdaySum += moneyForBirthday - 1;
            }
        }
        double allToysPrice = toyPrice * toyCounter;
        double totalMoney = allToysPrice + moneyForBirthdaySum;
        double difference = Math.abs(totalMoney - washingMachinePrice);

        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference);
        }
    }
}