import java.util.Scanner;

class TradeCommissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isTrue = true;

        switch (city) {
            case "Sofia":
                if (sells >= 0 && sells <= 500) {
                    commission = 0.05;
                } else if (sells > 500 && sells <= 1000) {
                    commission = 0.07;
                } else if (sells > 1000 && sells <= 10000) {
                    commission = 0.08;
                } else if (sells > 10000) {
                    commission = 0.12;
                } else if (sells < 0) {
                    isTrue = false;
                }
                break;
            case "Varna":
                if (sells >= 0 && sells <= 500) {
                    commission = 0.045;
                } else if (sells > 500 && sells <= 1000) {
                    commission = 0.075;
                } else if (sells > 1000 && sells <= 10000) {
                    commission = 0.1;
                } else if (sells > 10000) {
                    commission = 0.13;
                } else if (sells < 0) {
                    isTrue = false;
                }
                break;
            case "Plovdiv":
                if (sells >= 0 && sells <= 500) {
                    commission = 0.055;
                } else if (sells > 500 && sells <= 1000) {
                    commission = 0.08;
                } else if (sells > 1000 && sells <= 10000) {
                    commission = 0.12;
                } else if (sells > 10000) {
                    commission = 0.145;
                } else if (sells < 0) {
                    isTrue = false;
                }
                break;
            default:
                isTrue = false;
                break;
        }
        if (isTrue == true){
            double commissionPrice = commission * sells;
            System.out.printf("%.2f", commissionPrice);
        } else {
            System.out.println("error");
        }
    }
}