import java.util.Scanner;

class HighJump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finalGoal = Integer.parseInt(scanner.nextLine());
        int currGoal = finalGoal - 30;
        int currTry = 0;
        int jumpCounter = 0;
        int failCounter = 0;
        boolean isFailed = false;

        while (currGoal <= finalGoal || currTry <= finalGoal) {
            currTry = Integer.parseInt(scanner.nextLine());
            jumpCounter++;
            if (currTry > currGoal) {
                currGoal += 5;
                failCounter = 0;
            } else {
                failCounter++;
            }
            if (failCounter == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", currGoal, jumpCounter);
                isFailed = true;
                break;
            }
        }
        if (!isFailed) {
            currGoal -= 5;
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currGoal, jumpCounter);
        }
    }
}