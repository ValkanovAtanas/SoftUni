import java.util.Scanner;

class ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGrades = Integer.parseInt(scanner.nextLine());
        int poorGradesCount = 0;
        int gradesSum = 0;
        int gradesCount = 0;
        String lastTask = null;
        String taskName = scanner.nextLine();
        boolean areGradesPoor = false;

        while (!taskName.equals("Enough")) {
            lastTask = taskName;
            int currentGrade = Integer.parseInt(scanner.nextLine());
            gradesSum += currentGrade;
            gradesCount++;
            if (currentGrade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == poorGrades) {
                System.out.printf("You need a break, %d poor grades.%n", poorGrades);
                areGradesPoor = true;
                break;
            }



            taskName = scanner.nextLine();
        }
        if (areGradesPoor == false) {
            double averageScore = gradesSum * 1.0 / gradesCount;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", gradesCount);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}