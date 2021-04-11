import java.util.Scanner;

class PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSabrePrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double numOfLightSabres = Math.ceil(students * 1.1);
        int numOfBelts = students - (students / 6);

        double totalMoney = students * robePrice + lightSabrePrice * numOfLightSabres + beltPrice * numOfBelts;
        double difference = Math.abs(moneyAvailable - totalMoney);

        if (moneyAvailable >= totalMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", difference);
        }

    }
}