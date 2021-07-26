import java.util.Scanner;

public class Quiz4_5 {
    public static void main(String[] args){
        int num,year;
        Scanner input = new Scanner(System.in);

        num = input.nextInt();

        switch (num){
            case 2: year = 28;
            break;

            case 4: year = 30;
            break;

            case 6: year = 30;
            break;

            case 9: year = 30;
            break;

            case 11: year = 30;
            break;

            default: year=31;
            break;
        }
        System.out.print(year);
    }
}
