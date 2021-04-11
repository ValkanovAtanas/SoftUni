import java.util.Scanner;

class Shopping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int memoriesCount = Integer.parseInt(scanner.nextLine());

        double videoCardsSum = videoCardsCount * 250;
        double processorPrice = 0.35 * videoCardsSum;
        double memoryPrice = 0.1 * videoCardsSum;
        double totalPrice = videoCardsSum + (processorsCount * processorPrice) + (memoriesCount * memoryPrice);
        if (videoCardsCount > processorsCount){
            totalPrice *= 0.85;
        }
        double difference = Math.abs(budget - totalPrice);
        if(totalPrice <= budget){
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}