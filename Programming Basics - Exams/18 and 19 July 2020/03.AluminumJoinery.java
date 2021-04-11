import java.util.Scanner;

class AddBags {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (count < 10) {
            System.out.println("Invalid order");
        } else {
            switch (type) {
                case "90X130":
                    price = 110;
                    if (count > 60) {
                        price *= 0.92;
                    } else if (count > 30) {
                        price *= 0.95;
                    }
                    break;
                case "100X150":
                    price = 140;
                    if (count > 80) {
                        price *= 0.90;
                    } else if (count > 40) {
                        price *= 0.94;
                    }
                    break;
                case "130X180":
                    price = 190;
                    if (count > 50) {
                        price *= 0.88;
                    } else if  (count > 20){
                        price *= 0.93;
                    }
                    break;
                case "200X300":
                    price = 250;
                    if (count > 50) {
                        price *= 0.86;
                    } else if (count > 25) {
                        price *= 0.91;
                    }
                    break;

            }
            double joineryPrice = price * count;

            if (delivery.equals("With delivery")) {
                joineryPrice += 60;
            }

            if (count > 99){
                joineryPrice *= 0.96;
            }

            System.out.printf("%.2f BGN", joineryPrice);
        }
    }
}