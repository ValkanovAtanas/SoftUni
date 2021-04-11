import java.util.Scanner;

class OscarsCeremony {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallRent = Integer.parseInt(scanner.nextLine());

        double statues = 0.7 * hallRent;
        double catering = 0.85 * statues;
        double sound = catering / 2;

        double totalPrice = hallRent + statues + catering + sound;

        System.out.printf("%.2f", totalPrice);
    }
}