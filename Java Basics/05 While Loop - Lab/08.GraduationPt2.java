import java.util.Scanner;

class GraduationPt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int marksCounter = 0;
        double marksSum = 0;
        double badMarksCounter = 0;
        boolean areGradesGood = true;
        int gradeCounter = 0;

        while (gradeCounter < 12) {
            double currentMark = Double.parseDouble(scanner.nextLine());
            if (currentMark < 4) {
                marksCounter++;
                badMarksCounter++;
                marksSum += currentMark;
                if (badMarksCounter > 1) {
                    areGradesGood = false;
                    System.out.printf("%s has been excluded at %d grade",name, gradeCounter);
                }
            }
            if (areGradesGood == false) {
                break;
            } else {
                marksSum += currentMark;
                marksCounter++;
                gradeCounter++;
            }

        }
        if (areGradesGood == true) {
            double averageGrade = marksSum / marksCounter;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, averageGrade);
        }
    }
}