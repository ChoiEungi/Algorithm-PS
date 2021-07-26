import java.util.Scanner;

public class Quiz10_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double start = input.nextDouble();
        double end = input.nextDouble();
        squareNum(Math.sqrt(start),Math.sqrt(end));

    }
    public static void squareNum(double start, double end){
        int cnt =0 ;
        double max = start > end ? start:end;
        double min = start<end ? start:end ;
        min = Math.ceil(min);
        max = Math.floor(max);
        while (min<=max){
            min++;
            cnt ++;
        }
        System.out.println(cnt);

    }
}
