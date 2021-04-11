import java.util.Scanner;

class Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = Float.parseFloat(scanner.nextLine()) * 100;


        int coinsCounter = 0;

        while (sum != 0) {
            if (sum >= 200) {
                sum -= 200;
                coinsCounter++;
            } else if (sum >= 100) {
                sum -= 100;
                coinsCounter++;
            } else if (sum >= 50) {
                sum -= 50;
                coinsCounter++;
            } else if (sum >= 20) {
                sum -= 20;
                coinsCounter++;
            } else if (sum >= 10) {
                sum -= 10;
                coinsCounter++;
            } else if (sum >= 5) {
                sum -= 5;
                coinsCounter++;
            } else if (sum >= 2) {
                sum -= 2;
                coinsCounter++;
            } else if (sum >= 1) {
                sum -= 1;
                coinsCounter++;
            }
        }
        System.out.println(coinsCounter);
    }
}