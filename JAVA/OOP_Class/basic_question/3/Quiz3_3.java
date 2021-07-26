import java.util.Scanner;

public class Quiz3_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;

        a = input.nextInt();
        b = input.nextInt();
        a +=5;
        b *=2;
        System.out.printf("가로 = "+ a+"\n");
        System.out.printf("세로 = "+ b+"\n");
        System.out.printf("넓이 = "+ (a*b)+"\n");


    }
}
