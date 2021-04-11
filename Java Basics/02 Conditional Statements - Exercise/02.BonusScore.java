import java.util.Scanner;

class BonusScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (num <= 100) {
            bonusPoints += 5;
        } else if (num > 1000) {
            bonusPoints = num * 0.1;
        } else {
            bonusPoints = num * 0.2;
        }

        if (num % 2 == 0) {
            bonusPoints++;
        } else if (num % 10 == 5) {
            bonusPoints += 2;
        }
        System.out.println(bonusPoints);
        System.out.println(bonusPoints + num);
    }
}