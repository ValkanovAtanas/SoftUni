import java.util.Scanner;

class YardGreening {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double discount = 0.18 * (area * 7.61);
        double price = area * 7.61 - discount;
        System.out.printf("The final price is: %f lv.", price);
        System.out.printf("The discount is %f lv.", discount);
    }
}