import java.util.Scanner;

class EasterDecoration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfClients = Integer.parseInt(scanner.nextLine());
        double sumOfAllItemsForAllClients = 0;
        for (int i = 1; i <= numOfClients; i++) {
            String item = scanner.nextLine();
            int itemsCounter = 0;
            int basketCounter = 0;
            int wreathCounter = 0;
            int bunnyCounter = 0;
            double sumOfAllItemsPerClient = 0;
            while (!item.equals("Finish")) {
                switch (item) {
                    case "basket":
                        itemsCounter++;
                        basketCounter++;
                        sumOfAllItemsPerClient += 1.5;
                        break;
                    case "wreath":
                        itemsCounter++;
                        sumOfAllItemsPerClient += 3.8;
                        wreathCounter++;
                        break;
                    case "chocolate bunny":
                        itemsCounter++;
                        bunnyCounter++;
                        sumOfAllItemsPerClient += 7;
                        break;
                }
                item = scanner.nextLine();
            }
            if (item.equals("Finish")) {
                if (itemsCounter % 2 == 0) {
                    sumOfAllItemsPerClient *= 0.8;
                }
                sumOfAllItemsForAllClients += sumOfAllItemsPerClient;
                System.out.printf("You purchased %d items for %.2f leva.%n",itemsCounter, sumOfAllItemsPerClient);
            }
        }
        double averageMoneySpentPerClient = sumOfAllItemsForAllClients / numOfClients;
        System.out.printf("Average bill per client is: %.2f leva.", averageMoneySpentPerClient);
    }
}