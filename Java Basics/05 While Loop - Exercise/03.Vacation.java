import java.util.Scanner;

class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int spendCounter = 0;
        int daysCounter = 0;
        boolean canSheSaveTheMoney = true;

        String action = scanner.nextLine();
        while (true) {
            daysCounter++;
            if (action.equals("spend")) {
                spendCounter++;
                availableMoney -= Double.parseDouble(scanner.nextLine());
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
                if (spendCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(daysCounter);
                    canSheSaveTheMoney = false;
                    break;
                }
            } else if (action.equals("save")) {
                spendCounter = 0;
                availableMoney += Double.parseDouble(scanner.nextLine());
            }
            if (availableMoney >= moneyNeeded) {
                System.out.printf("You saved the money for %d days.", daysCounter);
                break;
            }
            if (canSheSaveTheMoney == false) {
                break;
            }
            action = scanner.nextLine();
        }
    }
}