import java.util.Scanner;

class USDtoBGN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = 1.79549;
        double bgn = Double.parseDouble(scanner.nextLine());
        System.out.println(usd * bgn);;
    }
}