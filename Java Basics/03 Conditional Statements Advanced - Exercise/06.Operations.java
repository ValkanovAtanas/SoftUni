import java.util.Scanner;

class Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N1 = Double.parseDouble(scanner.nextLine());
        double N2 = Double.parseDouble(scanner.nextLine());
        String mathOperator = scanner.nextLine();

        if (mathOperator.equals("+")) {
            double result = N1 + N2;
            if (result % 2 == 0) {
                String oddOrEven = "even";
                System.out.printf("%.0f + %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            } else {
                String oddOrEven = "odd";
                System.out.printf("%.0f + %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            }
        } else if (mathOperator.equals("-")) {
            double result = N1 - N2;
            if (result % 2 == 0) {
                String oddOrEven = "even";
                System.out.printf("%.0f - %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            } else {
                String oddOrEven = "odd";
                System.out.printf("%.0f - %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            }
        } else if (mathOperator.equals("*")) {
            double result = N1 * N2;
            if (result % 2 == 0) {
                String oddOrEven = "even";
                System.out.printf("%.0f * %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            } else {
                String oddOrEven = "odd";
                System.out.printf("%.0f * %.0f = %.0f - %s", N1, N2, result, oddOrEven);
            }
        } else if (mathOperator.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                double result = N1 / N2;
                System.out.printf("%.0f / %.0f = %.2f", N1, N2, result);
            }
        } else if (mathOperator.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
            } else {
                double result = N1 % N2;
                System.out.printf("%.0f %% %.0f = %.0f", N1, N2, result);
            }
        }
    }
}