import java.util.Scanner;

class MovieTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int fourthSymbol = a1; fourthSymbol <= a2 - 1; fourthSymbol++) {
            if (fourthSymbol % 2 == 1) {
                char firstSymbol = (char) fourthSymbol;
                for (int secondSymbol = 1; secondSymbol <= n - 1; secondSymbol++) {
                    for (int thirdSymbol = 1; thirdSymbol <= n/2 - 1; thirdSymbol++) {
                        if ((secondSymbol + thirdSymbol + fourthSymbol) % 2 == 1) {
                            System.out.printf("%c-%d%d%d%n", firstSymbol, secondSymbol, thirdSymbol, fourthSymbol);
                        }
                    }
                }
            }
        }

    }
}