import java.util.Scanner;

class TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        double totalScoreSum = 0;
        int presentationsCount = 0;

        while (!presentationName.equals("Finish")) {
            double presentationScoreSum = 0;
            presentationsCount++;
            for (int i = 1; i <= juryCount; i++) {
                presentationScoreSum += Double.parseDouble(scanner.nextLine());
            }
            double averageScoreForPresentation = presentationScoreSum / juryCount;
            System.out.printf("%s - %.2f.%n", presentationName, averageScoreForPresentation);
            totalScoreSum += averageScoreForPresentation;
            presentationName = scanner.nextLine();
        }
        double finalScore = totalScoreSum / presentationsCount;
        System.out.printf("Student's final assessment is %.2f.", finalScore);
    }
}