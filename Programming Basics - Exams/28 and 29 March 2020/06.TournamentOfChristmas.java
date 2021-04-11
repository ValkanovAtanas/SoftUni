import java.util.Scanner;

class TournamentOfChristmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentDays = Integer.parseInt(scanner.nextLine());
        int totalWins = 0;
        int totalLoses = 0;
        double totalMoneyWon = 0;

        for (int i = 1; i <= tournamentDays; i++) {
            String sport = scanner.nextLine();
            double moneyWonForCurDay = 0;
            int wonGamesForCurDay = 0;
            int lostGamesForCurDay = 0;
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    wonGamesForCurDay++;
                    moneyWonForCurDay += 20;
                } else {
                    lostGamesForCurDay++;
                }
                sport = scanner.nextLine();
            }
            if (wonGamesForCurDay > lostGamesForCurDay) {
                moneyWonForCurDay *= 1.1;
                totalWins++;
            } else {
                totalLoses++;
            }
            totalMoneyWon += moneyWonForCurDay;
        }
        if (totalWins > totalLoses) {
            totalMoneyWon *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoneyWon);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoneyWon);
        }
    }
}