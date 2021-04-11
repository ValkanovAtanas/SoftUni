import java.util.Scanner;

class AreaOfFigures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side;
            System.out.printf("%.3f", area);
        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double area = sideA * sideB;
            System.out.printf("%.3f", area);
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("%.3f", area);
        } else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double heightToSide = Double.parseDouble(scanner.nextLine());
            double area = side * heightToSide / 2;
            System.out.printf("%.3f", area);
        }

    }
}