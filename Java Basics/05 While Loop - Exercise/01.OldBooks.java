import java.util.Scanner;

class OldBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int checkedBooksCounter = 0;
        boolean isFound = false;

        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(searchBook)) {
                System.out.printf("You checked %d books and found it.", checkedBooksCounter);
                isFound = true;
                break;
            }
            currentBook = scanner.nextLine();
            checkedBooksCounter++;
        }
        if (isFound == false) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checkedBooksCounter);
        }

    }
}