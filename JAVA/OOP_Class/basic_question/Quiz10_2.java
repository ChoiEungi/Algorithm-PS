import java.util.Scanner;

public class Quiz10_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        calSum(start);


    }
    public static void calSum(int num){
        int i,sum=0;
        for (i=1;i<=num;i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
