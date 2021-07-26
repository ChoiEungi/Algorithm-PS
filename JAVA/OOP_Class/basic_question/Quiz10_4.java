import java.util.Scanner;

public class Quiz10_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        calculator(first,second);

    }
    public static void calculator(int p,int q){
        System.out.print(Math.abs(p*p-q*q));

    }
}
