import java.util.Scanner;

public class Quiz10_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("원의 반지름 : ");
        double r = input.nextDouble();
        calArea(r);
    }
    public static void calArea(double r){
        final double PI = 3.141592 ;
        System.out.printf("원의 넓이 = %.3f",r*r*PI);
    }
}
