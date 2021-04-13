import java.util.Scanner;

class Balls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfBalls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int redBallsPoints = 0;
        int orangeBallsPoints = 0;
        int yellowBallsPoints = 0;
        int whiteBallsPoints = 0;
        int blackBallsCounter = 0;
        int otherColorsCounter = 0;

        for (int i = 1; i <= numOfBalls; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor) {
                case "red":
                    redBallsPoints++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orangeBallsPoints++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellowBallsPoints++;
                    totalPoints += 15;
                    break;
                case "white":
                    whiteBallsPoints++;
                    totalPoints += 20;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackBallsCounter++;
                    break;
                default:
                    otherColorsCounter++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Points from red balls: %d%n", redBallsPoints);
        System.out.printf("Points from orange balls: %d%n", orangeBallsPoints);
        System.out.printf("Points from yellow balls: %d%n", yellowBallsPoints);
        System.out.printf("Points from white balls: %d%n", whiteBallsPoints);
        System.out.printf("Other colors picked: %d%n", otherColorsCounter);
        System.out.printf("Divides from black balls: %d", blackBallsCounter);
    }
}