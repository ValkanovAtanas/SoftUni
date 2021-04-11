import java.util.Scanner;

class NameGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String bestPlayer = null;
        int bestPlayerScore = Integer.MIN_VALUE;
        while (!name.equals("Stop")) {
            int lengthName = name.length();
            int currPlayerScore = 0;
            for (int i = 0; i < lengthName; i++) {
                int currNum = Integer.parseInt(scanner.nextLine());
                char character = name.charAt(i);
                int asciiNum = (int) character;
                if (asciiNum == currNum) {
                    currPlayerScore += 10;
                } else {
                    currPlayerScore += 2;
                }
            }
            if (currPlayerScore >= bestPlayerScore) {
                bestPlayerScore = currPlayerScore;
                bestPlayer = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", bestPlayer, bestPlayerScore);
    }
}