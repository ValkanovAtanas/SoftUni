import java.util.Scanner;

class Moving {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int boxesCount = 0;
        int freeSpace = width * height * length;
        boolean isFreeSpaceEnough = true;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            boxesCount += Integer.parseInt(input);

            if (boxesCount >= freeSpace) {
                int volumeNeeded = boxesCount - freeSpace;
                System.out.printf("No more free space! You need %d Cubic meters more.", volumeNeeded);
                isFreeSpaceEnough = false;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFreeSpaceEnough == true) {
            int volumeLeft = freeSpace - boxesCount;
            System.out.printf("%d Cubic meters left.", volumeLeft);
        }
    }
}