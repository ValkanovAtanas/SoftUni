import java.util.Scanner;

class FavoriteMovie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bestMovieScore = Integer.MIN_VALUE;
        String bestMovie = null;
        boolean isLimitReached = false;

        for (int moviesCount = 1; moviesCount <= 7; moviesCount++) {
            String movie = scanner.nextLine();
            if (movie.equals("STOP")) {
                break;
            }
            int currMovieScore = 0;
            int movieLettersCount = movie.length();
            for (int currentLetterNum = 0; currentLetterNum < movieLettersCount; currentLetterNum++) {
                char currentLetter = movie.charAt(currentLetterNum);
                int currentLetterAsciiValue = (int) currentLetter;
                currMovieScore += currentLetterAsciiValue;
                if (currentLetterAsciiValue >= 97 && currentLetterAsciiValue <= 122) {
                    currMovieScore -= 2 * movieLettersCount;
                } else  if (currentLetterAsciiValue >= 65 && currentLetterAsciiValue <= 90){
                    currMovieScore -= movieLettersCount;
                }
            }
            if (currMovieScore > bestMovieScore) {
                bestMovieScore = currMovieScore;
                bestMovie = movie;
            }
            if (moviesCount == 7) {
                isLimitReached = true;
            }
        }
        if (isLimitReached == true) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestMovieScore);
    }
}