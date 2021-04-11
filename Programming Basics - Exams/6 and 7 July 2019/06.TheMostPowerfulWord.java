import java.util.Scanner;

class TheMostPowerfulWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int mostPowerfulWordValue = Integer.MIN_VALUE;
        String mostPowerfulWord = null;

        while (!word.equals("End of words")) {
            int wordLength = word.length();
            int sumOfAscii = 0;
            char firstLetter = word.charAt(0);
            char lowerCaseOfFirstLetter = Character.toLowerCase(firstLetter);
            for (int i = 0; i < wordLength; i++) {
                char characher = word.charAt(i);
                int ascii = (int) characher;
                sumOfAscii += ascii;
            }
            if (lowerCaseOfFirstLetter == 'y' ||lowerCaseOfFirstLetter == 'a' ||lowerCaseOfFirstLetter == 'e' ||lowerCaseOfFirstLetter == 'i' ||lowerCaseOfFirstLetter == 'o' ||lowerCaseOfFirstLetter == 'u') {
                sumOfAscii *= wordLength;
            } else {
                sumOfAscii = Math.round(sumOfAscii / wordLength);
            }
            if (sumOfAscii > mostPowerfulWordValue) {
                mostPowerfulWordValue = sumOfAscii;
                mostPowerfulWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, mostPowerfulWordValue);
    }
}