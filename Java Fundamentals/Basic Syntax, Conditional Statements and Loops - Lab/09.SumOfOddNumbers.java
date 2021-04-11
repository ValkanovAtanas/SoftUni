import java.util.Scanner;

class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= num * 2; i += 2) {
            counter++;
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", sum);
    }
}