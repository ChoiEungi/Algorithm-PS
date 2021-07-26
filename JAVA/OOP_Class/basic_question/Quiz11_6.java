import java.util.Scanner;

public class Quiz11_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int num = n*m*k;
        System.out.print(recursion(1,num));
        return;
    }
    public static int recursion(int tot, int num){
        if (num/10 ==0){
            return tot*num;
        }
        if (num%10 !=0) {
            return recursion(tot*(num%10),num/10);
        }
        else if (num%10==0) {
            return recursion(tot,num/10);
        }
        return 0;


    }
}

