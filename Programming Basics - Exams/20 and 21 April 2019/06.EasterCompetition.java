import java.util.Scanner;

class EasterGuests {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfEasterBreads = Integer.parseInt(scanner.nextLine());
        int bestResultAllChefs = Integer.MIN_VALUE;
        String bestChef = "";

        for (int i = 1; i <= numOfEasterBreads; i++) {
            String lastChef = "";
            String input = scanner.nextLine();
            if (!input.equals("Finish")) {
                lastChef = input;
                input = scanner.nextLine();
            }
            int bestResultCurrentChef = 0;
            while (!input.equals("Stop")) {
                int currScore = Integer.parseInt(input);
                bestResultCurrentChef += currScore;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", lastChef, bestResultCurrentChef);
            if (bestResultCurrentChef > bestResultAllChefs) {
                bestResultAllChefs = bestResultCurrentChef;
                bestChef = lastChef;
                System.out.printf("%s is the new number 1!%n", lastChef);
            }
        }
        System.out.printf("%s won competition with %d points!", bestChef, bestResultAllChefs);
    }
}