import java.util.Scanner;

class DivisionWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;

        for (int i = 0; i < n; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            if (currNum % 2 == 0) {
                p1Counter++;
            }
            if (currNum % 3 == 0) {
                p2Counter++;
            }
            if (currNum % 4 == 0) {
                p3Counter++;
            }
        }
        double percentage1 = p1Counter * 1.0 / n * 100;
        double percentage2 = p2Counter * 1.0 / n * 100;
        double percentage3 = p3Counter * 1.0 / n * 100;
        System.out.printf("%.2f%%%n",percentage1);
        System.out.printf("%.2f%%%n",percentage2);
        System.out.printf("%.2f%%%n",percentage3);
    }
}