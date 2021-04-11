import java.util.Scanner;

class TriangleOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        for (int rows = 1; rows <= number; rows++) {
            for (int j = 1; j <= counter; j++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
            counter++;
        }
    }
}