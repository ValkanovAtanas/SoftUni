import java.util.Scanner;

class CatWalking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int caloriesTaken = Integer.parseInt(scanner.nextLine());

        double totalMinutes = minutesPerDay * walksCount;
        double caloriesOut = totalMinutes * 5;
        double caloriesGoal = caloriesTaken / 2;

        if (caloriesOut >= caloriesGoal){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", caloriesOut);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", caloriesOut);
        }

    }
}