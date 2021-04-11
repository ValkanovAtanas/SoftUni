import java.util.Scanner;

class Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width  = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int piecesCount = width * length;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            piecesCount -= Integer.parseInt(input);
            if (piecesCount <= 0) {
                int neededPieces = Math.abs(piecesCount);
                System.out.printf("No more cake left! You need %d pieces more.", neededPieces);
                break;
            }
            input = scanner.nextLine();
        }
        if (piecesCount > 0) {
            System.out.printf("%d pieces are left.", piecesCount);
        }
    }
}