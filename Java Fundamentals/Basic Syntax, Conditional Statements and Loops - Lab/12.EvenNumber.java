import java.util.Scanner;

class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 == 1 || number % 2 == -1) {
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }
        number = Math.abs(number);
        System.out.printf("The number is: %d", number);
    }
}