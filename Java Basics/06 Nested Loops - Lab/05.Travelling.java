import java.util.Scanner;

class Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End"))
        {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double moneycollected = 0;
            while (moneycollected < minBudget)
            {
                moneycollected += Double.parseDouble(scanner.nextLine());
                if (moneycollected >= minBudget)
                {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
            }
            destination = scanner.nextLine();
        }
    }
}