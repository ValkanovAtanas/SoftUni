import java.util.Scanner;

class TimePlus15Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (hours == 23 && minutes > 44) {
            hours = 0;
            minutes -= 45;
        } else if (minutes > 44) {
            hours++;
            minutes -= 45;
        } else {
            minutes += 15;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}