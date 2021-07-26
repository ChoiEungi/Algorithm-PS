import java.util.Scanner;

public class Quiz3_7 {
    public static void main(String[] args){
        double a,b,c,avg;
        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        avg = (a+b+c)/3.0;

        System.out.printf("총점 %d점\n",(int)a+(int)b+(int)c);
        System.out.printf("평균 %.0f점\n",avg);


    }
}