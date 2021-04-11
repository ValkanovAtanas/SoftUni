import java.util.Scanner;

class Salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabsCount = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        boolean wasSalaryLost = false;

        for (int i = 1; i <= tabsCount; i++) {
            String site = scanner.nextLine();
            if (site.equals("Facebook")) {
                salary -= 150;
            } else if (site.equals("Instagram")) {
                salary -= 100;
            } else  if (site.equals("Reddit")){
                salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                wasSalaryLost = true;
                break;
            }
        }
        if (wasSalaryLost == false) {
            System.out.printf("%.0f", salary);
        }
    }
}