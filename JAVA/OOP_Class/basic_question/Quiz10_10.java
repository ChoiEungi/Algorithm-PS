import java.util.Scanner;

public class Quiz10_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double q = input.nextDouble();
        double r = input.nextDouble();
        printSum(p,q,r);
    }
    public static void printSum(double p,double q, double r){
        System.out.println(Math.round((p+q+r)/3));
        System.out.println(Math.round((Math.round(p)+Math.round(q)+Math.round(r))/3.0));
    }
}
