import java.util.Scanner;

class ProjectsCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int numOfProjects = Integer.parseInt(scanner.nextLine());
        int hours = numOfProjects * 3;
        System.out.println("The architect " + architectName + " will need " + hours + " hours to complete " + numOfProjects + " project/s.");
    }
}