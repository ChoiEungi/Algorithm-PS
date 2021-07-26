import java.util.Scanner;

public class Quiz10_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        squared(n);
    }
    public static void squared(int n){
        int i ,sum=1;
        for(i=0;i<n;i++){
            sum *= 2;
        }
        System.out.println(sum);

    }
}