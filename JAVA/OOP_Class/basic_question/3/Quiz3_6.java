import java.util.Scanner;

public class Quiz3_6{

    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.printf("%.1f점",(a+b+c)/3.0);


    }
}