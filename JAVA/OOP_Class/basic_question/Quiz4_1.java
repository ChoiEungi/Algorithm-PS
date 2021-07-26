import java.util.Scanner;

public class Quiz4_1 {
    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a>=b){
            System.out.print(a-b);
        }
        else {
            System.out.print(b-a);
        }

    }
}
