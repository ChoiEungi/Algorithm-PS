import java.util.Scanner;

public class Quiz5_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        int width, height;
        char check = 'y';


        do {

            if (check == 'Y' || check == 'y') {
                System.out.print("밑변의 길이 = ");
                width = input.nextInt();
                System.out.print("높이 = ");
                height = input.nextInt();
                System.out.printf("입력한 삼각형의 넓이는 %.1f입니다\n", width * height / 2.0);
            } else {
                break;
            }
            System.out.print("계속하시겠습니까? ");
            check = input.next().charAt(0);
        } while (true);

    }
}