import java.util.Scanner;

class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 1; i <= n; i++) {
            int currNum = Integer.parseInt(scanner.nextLine());
            if (currNum < 200) {
                p1Count++;
            } else if (currNum >= 200 && currNum < 400) {
                p2Count++;
            } else if (currNum >= 400 && currNum < 600) {
                p3Count++;
            } else if (currNum >= 600 && currNum < 800) {
                p4Count++;
            } else {
                p5Count++;
            }
        }
        double p1 = p1Count * 1.0 / n * 100.0;
        double p2 = p2Count * 1.0 / n * 100.0;
        double p3 = p3Count * 1.0 / n * 100.0;
        double p4 = p4Count * 1.0 / n * 100.0;
        double p5 = p5Count * 1.0 / n * 100.0;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%", p5);
    }
}