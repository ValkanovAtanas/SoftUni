import java.util.Scanner;

class MobileOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractDuration = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileData = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double monthlyFee = 0;

        switch (contractType) {
            case "Small":
                switch (contractDuration) {
                    case "one":
                        monthlyFee = 9.98;
                        break;
                    case "two":
                        monthlyFee = 8.58;
                        break;
                }
                break;
            case "Middle":
                switch (contractDuration) {
                    case "one":
                        monthlyFee = 18.99;
                        break;
                    case "two":
                        monthlyFee = 17.09;
                        break;
                }
                break;
            case "Large":
                switch (contractDuration) {
                    case "one":
                        monthlyFee = 25.98;
                        break;
                    case "two":
                        monthlyFee = 23.59;
                        break;
                }
                break;
            case "ExtraLarge":
                switch (contractDuration) {
                    case "one":
                        monthlyFee = 35.99;
                        break;
                    case "two":
                        monthlyFee = 31.79;
                        break;
                }
                break;
        }
        if (mobileData.equals("yes")) {
            if (monthlyFee > 30) {
                monthlyFee += 3.85;
            } else if (monthlyFee > 10) {
                monthlyFee += 4.35;
            } else {
                monthlyFee += 5.5;
            }
        }
        if (contractDuration.equals("two")) {
            monthlyFee *= 0.9625;
        }
        double totalPrice = monthlyFee * months;
        System.out.printf("%.2f lv.", totalPrice);
    }
}