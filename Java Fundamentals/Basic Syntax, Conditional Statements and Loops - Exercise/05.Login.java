import java.util.Scanner;

class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reversedName = "";
        int failCounter = 0;
        boolean isFailed = false;

        for (int i = name.length() - 1; i >= 0; i--) {
            char a = name.charAt(i);
            reversedName += a;
        }
        String pass = scanner.nextLine();

        while (!reversedName.equals(pass)) {
            failCounter++;
            if (failCounter == 4) {
                isFailed = true;
                System.out.printf("User %s blocked!", name);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        if (isFailed == false) {
            System.out.printf("User %s logged in.", name);
        }

    }
}