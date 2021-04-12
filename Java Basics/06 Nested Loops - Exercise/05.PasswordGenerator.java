import java.util.Scanner;

class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int firstSymbol = 1; firstSymbol <= n; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol <= n; secondSymbol++) {
                for (int i = 97; i < 97 + l; i++) {
                    char thirdSymbol = (char) i;
                    for (int j = 97; j < 97 + l; j++) {
                        char fourthSymbol = (char) j;
                        for (int fifthSymbol = 1; fifthSymbol <= n; fifthSymbol++) {
                            if (fifthSymbol > firstSymbol && fifthSymbol > secondSymbol) {
                                System.out.printf("%d%d%c%c%d ", firstSymbol, secondSymbol, thirdSymbol, fourthSymbol, fifthSymbol);
                            }
                        }
                    }
                }
            }
        }
    }
}