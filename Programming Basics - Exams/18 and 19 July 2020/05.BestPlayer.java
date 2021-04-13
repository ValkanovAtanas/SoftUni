import java.util.Scanner;

class BestPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        String bestPlayer = "";
        int bestPlayerScore = Integer.MIN_VALUE;
        boolean madeHeHatTrick = false;

        while (!playerName.equals("END")) {
            int numOfGoals = Integer.parseInt(scanner.nextLine());
            if (numOfGoals > bestPlayerScore) {
                bestPlayer = playerName;
                bestPlayerScore = numOfGoals;
                if (numOfGoals > 2) {
                    madeHeHatTrick = true;
                }
                if (numOfGoals > 9) {
                    break;
                }
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (madeHeHatTrick == true) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestPlayerScore);
        } else {
            System.out.printf("He has scored %d goals.", bestPlayerScore);
        }
    }
}