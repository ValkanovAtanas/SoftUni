import java.util.Scanner;

class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());
        int totalMinsOfExam = hourOfExam * 60 + minutesOfExam;
        int totalMinsOfArrival = hourOfArrival * 60 + minutesOfArrival;

        if (totalMinsOfArrival == totalMinsOfExam || totalMinsOfExam - totalMinsOfArrival <= 30 && totalMinsOfExam - totalMinsOfArrival > 0) {
            System.out.println("On time");
            if (totalMinsOfExam != totalMinsOfArrival) {
                int minutesEarlier = totalMinsOfExam - totalMinsOfArrival;
                System.out.printf("%d minutes before the start", minutesEarlier);
            }
        } else if (totalMinsOfExam - totalMinsOfArrival > 30) {
            System.out.println("Early");
            int minsEarly = totalMinsOfExam - totalMinsOfArrival;
            if (minsEarly < 60) {
                System.out.printf("%d minutes before the start", minsEarly);
            } else if (minsEarly >= 60) {
                int hours = minsEarly / 60;
                int minutes = minsEarly % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        } else if (totalMinsOfArrival - totalMinsOfExam > 0) {
            System.out.println("Late");
            int minsLate = totalMinsOfArrival - totalMinsOfExam;
            if (minsLate < 60) {
                System.out.printf("%d minutes after the start", minsLate);
            } else if (minsLate >= 60) {
                int hours = minsLate / 60;
                int minutes = minsLate % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        }

    }
}