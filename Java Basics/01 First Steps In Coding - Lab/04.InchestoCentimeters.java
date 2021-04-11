import java.util.Scanner;

class InchesToCentimeters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm = Double.parseDouble(scanner.nextLine());
        System.out.println(cm * 2.54);
    }
}