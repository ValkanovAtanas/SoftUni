import java.util.Scanner;

class Building {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int appartments = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < appartments; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                }
                if (i % 2 == 0 && i != floors) {
                    System.out.printf("O%d%d ", i, j);
                } else if (i % 2 == 1 && i != floors) {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}