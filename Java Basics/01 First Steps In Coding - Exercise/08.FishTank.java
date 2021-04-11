import java.util.Scanner;

class FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double aquariumVolume = length * width * height / 1000.0;
        double waterVolume = aquariumVolume * (1 - percent / 100);
        System.out.printf("%.2f", waterVolume);
    }
}