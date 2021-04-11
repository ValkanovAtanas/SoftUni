import java.util.Scanner;

class SpeedInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String speedString = null;

        if (speed <= 10) {
            speedString = "slow";
        } else if (speed > 10 && speed <= 50){
            speedString = "average";
        } else if (speed > 50 && speed <= 150){
            speedString = "fast";
        } else if (speed > 150 && speed <= 1000){
            speedString = "ultra fast";
        } else if (speed > 1000){
            speedString = "extremely fast";
        }

        System.out.println(speedString);
    }
}