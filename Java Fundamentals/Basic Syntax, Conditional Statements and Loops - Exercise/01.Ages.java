import java.util.Scanner;

class Ages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String personType = "";

        if (age >= 66) {
            personType = "elder";
        } else if ( age > 19) {
            personType = "adult";
        } else if (age > 13) {
            personType = "teenager";
        } else if (age > 2) {
            personType = "child";
        } else {
            personType = "baby";
        }
        System.out.println(personType);
    }
}