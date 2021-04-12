import java.util.Scanner;

class Clock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int hours = 0; hours < 24; hours++)
        {
            for (int minutes = 0; minutes < 60; minutes++)
            {
                System.out.printf("%d:%d%n", hours, minutes);
            }
        }
    }
}