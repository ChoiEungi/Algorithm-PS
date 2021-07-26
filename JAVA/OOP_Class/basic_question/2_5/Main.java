import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("몇 야드인지 입력하시오. ");
        double a = input.nextDouble();
        String str = Double.toString(a);

        System.out.printf("%s야드 = %.1fcm \n", str, a*91.44);

    }
}
