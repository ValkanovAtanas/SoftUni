import java.util.Scanner;

class NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isTrue = true;

        for (int rows = 1; rows <= num; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(currentNum + " ");
                currentNum++;
                if (currentNum > num) {
                    isTrue = false;
                    break;
                }
            }
            System.out.println();
            if (isTrue == false) {
                break;
            }
        }
    }
}