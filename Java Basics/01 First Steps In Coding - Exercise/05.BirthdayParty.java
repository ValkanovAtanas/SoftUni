import java.util.Scanner;

class VacationBooksList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hallRent = Integer.parseInt(scanner.nextLine());
        double cake = 0.2 * hallRent;
        double drinks = 0.55 * cake;
        double animator = hallRent / 3;
        System.out.println(hallRent + cake + drinks + animator);
    }
}