import java.util.Scanner;

class HighJump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName = scanner.nextLine();
        int gameWins = 0;
        int gameLoses = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int numOfMatches = Integer.parseInt(scanner.nextLine());
            int gameCount = 0;
            for (int i = 1; i <= numOfMatches; i++) {
                gameCount += 1;
                int desiTeamScore = Integer.parseInt(scanner.nextLine());
                int rivalTeamScore = Integer.parseInt(scanner.nextLine());
                if (desiTeamScore > rivalTeamScore) {
                    int winPoints = desiTeamScore - rivalTeamScore;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", gameCount,tournamentName, winPoints);
                    gameWins += 1;
                } else {
                    int losePoints = rivalTeamScore - desiTeamScore;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", gameCount,tournamentName, losePoints);
                    gameLoses += 1;
                }
            }
            tournamentName = scanner.nextLine();
        }
        double percentageGameWins = gameWins * 1.0 / (gameLoses + gameWins) * 100;
        double percentageGameLoses = 100 - percentageGameWins;
        System.out.printf("%.2f%% matches win%n", percentageGameWins);
        System.out.printf("%.2f%% matches lost%n", percentageGameLoses);
    }
}