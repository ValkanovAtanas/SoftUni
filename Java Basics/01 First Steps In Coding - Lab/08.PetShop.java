import java.util.Scanner;

class PetShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ownDogs = Integer.parseInt(scanner.nextLine());
        int neighbourDogs = Integer.parseInt(scanner.nextLine());
        double result = ownDogs * 2.50 + neighbourDogs * 4;
        System.out.println(result + " lv");
    }
}