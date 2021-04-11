import java.util.Scanner;

class FootballResults {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMatch = scanner.nextLine();
        String secondMatch = scanner.nextLine();
        String thirdMatch = scanner.nextLine();

        int firstTeamWins = 0;
        int firsTeamDrawn = 0;
        int firstTeamLoses = 0;

        char firstMachFirstTeamResultChar = firstMatch.charAt(0);
        char firstMatchSecondTeamResultChar = firstMatch.charAt(2);
        int firstMatchFirstTeamResult = firstMachFirstTeamResultChar - '0';
        int firstMatchSecondTeamResult = firstMatchSecondTeamResultChar - '0';
        if (firstMatchFirstTeamResult > firstMatchSecondTeamResult){
            firstTeamWins++;
        } else if (firstMatchFirstTeamResult < firstMatchSecondTeamResult){
            firstTeamLoses++;
        } else {
            firsTeamDrawn++;
        }
        char secondMachFirstTeamResultChar = secondMatch.charAt(0);
        char secondMatchSecondTeamResultChar = secondMatch.charAt(2);
        int secondMatchFirstTeamResult = secondMachFirstTeamResultChar - '0';
        int secondMatchSecondTeamResult = secondMatchSecondTeamResultChar - '0';
        if (secondMatchFirstTeamResult > secondMatchSecondTeamResult){
            firstTeamWins++;
        } else if (secondMatchFirstTeamResult < secondMatchSecondTeamResult){
            firstTeamLoses++;
        } else {
            firsTeamDrawn++;
        }
        char thirdMachFirstTeamResultChar = thirdMatch.charAt(0);
        char thirdMatchSecondTeamResultChar = thirdMatch.charAt(2);
        int thirdMatchFirstTeamResult = thirdMachFirstTeamResultChar - '0';
        int thirdMatchSecondTeamResult = thirdMatchSecondTeamResultChar - '0';
        if (thirdMatchFirstTeamResult > thirdMatchSecondTeamResult){
            firstTeamWins++;
        } else if (thirdMatchFirstTeamResult < thirdMatchSecondTeamResult){
            firstTeamLoses++;
        } else {
            firsTeamDrawn++;
        }

        System.out.printf("Team won %d games.%nTeam lost %d games.%nDrawn games: %d", firstTeamWins, firstTeamLoses, firsTeamDrawn);

    }
}