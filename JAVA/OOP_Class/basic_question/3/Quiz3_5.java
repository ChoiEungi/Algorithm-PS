import java.util.Scanner;

public class Quiz3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        System.out.printf("민수의 키와 몸무게 입력 ");
        a = input.nextInt();
        b = input.nextInt();

        System.out.printf("기영이의 키와 몸무게 입력 ");
        c = input.nextInt();
        d = input.nextInt();

        boolean know = (a>c)&&(b>d);
        int myInt = (know) ? 1:0 ; //convert boolean to int

        System.out.print(myInt);


    }
}
