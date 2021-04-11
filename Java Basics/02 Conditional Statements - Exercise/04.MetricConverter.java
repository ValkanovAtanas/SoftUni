import java.util.Scanner;

class MetricConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        double meter = 0;
        double outputNum = 0;
        if (input.equals("mm")) {
            num /= 1000;
        } else if (input.equals("cm")) {
            num /= 100;
        } else if (input.equals("m")){
            num *= 1;
        }

        if (output.equals("mm")){
            outputNum = num * 1000;
        } else if (output.equals("m")){
            outputNum = num / 1;
        } else if (output.equals("cm")){
            outputNum = num * 100;
        }
        System.out.printf("%.3f", outputNum);
    }
}