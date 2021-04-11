import java.util.Scanner;

class InvalidNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num < 100 || num > 200) {
            if (num == 0) {
            } else {
                System.out.println("invalid");
            }
        }
    }
}