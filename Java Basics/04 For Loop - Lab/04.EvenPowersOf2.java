import java.util.Scanner;

class EvenPowersOf2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0){
                double num = Math.pow(2,i);
                System.out.printf("%.0f%n", num);
            }
        }
    }
}