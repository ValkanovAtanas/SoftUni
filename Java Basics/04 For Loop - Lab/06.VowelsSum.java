import java.util.Scanner;

class VowelsSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int vowelsSum = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a') {
                vowelsSum++;
            } else if (letter == 'e') {
                vowelsSum += 2;
            } else if (letter == 'i') {
                vowelsSum += 3;
            } else if (letter == 'o') {
                vowelsSum += 4;
            } else if (letter == 'u') {
                vowelsSum += 5;
            }
        }
        System.out.println(vowelsSum);
    }
}