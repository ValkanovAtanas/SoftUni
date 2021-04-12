import java.util.Scanner;

class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        for (int i = startNum; i <= endNum; i++)
        {
            for (int j = startNum; j <= endNum; j++)
            {
                combinations++;
                if (i + j == magicNum)
                {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, magicNum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", combinations, magicNum);
    }
}