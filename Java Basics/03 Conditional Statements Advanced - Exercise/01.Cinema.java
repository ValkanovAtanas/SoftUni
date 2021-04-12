import java.util.Scanner;

class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int coloumns = Integer.parseInt(scanner.nextLine());

        if (projectType.equals("Premiere")) {
            double price = 12 * rows * coloumns;
            System.out.printf("%.2f leva", price);
        } else if (projectType.equals("Normal")) {
            double price = 7.5 * rows * coloumns;
            System.out.printf("%.2f leva", price);
        } else {
            double price = 5 * rows * coloumns;
            System.out.printf("%.2f leva", price);
        }
    }
}