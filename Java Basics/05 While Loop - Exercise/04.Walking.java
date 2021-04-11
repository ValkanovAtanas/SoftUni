import java.util.Scanner;

class Walking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stepsGoal = 10000;

        while (!input.equals("Going home")) {
            stepsGoal -= Integer.parseInt(input);
            if (stepsGoal <= 0) {
                System.out.println("Goal reached! Good job!");
                int difference = Math.abs(stepsGoal);
                System.out.printf("%d steps over the goal!", difference);
                break;
            }


            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            stepsGoal -= Integer.parseInt(scanner.nextLine());
            int difference = Math.abs(stepsGoal);
            if (stepsGoal > 0) {
                System.out.printf("%d more steps to reach goal.", stepsGoal);
            } else {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", difference);
            }
        }
    }
}