import java.util.Scanner;

public class Quiz11_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        recursion(n);
    }
    public static void recursion(int num){
        if (num<=0){
            return ;
        }
        recursion(num-2);
        System.out.print(num+" ");
        return ;

    }
}
