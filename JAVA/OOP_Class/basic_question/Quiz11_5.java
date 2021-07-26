import java.util.Scanner;

public class Quiz11_5{
    static int cnt = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        recursion(n);
    }
    public static void recursion(int num){
        if (num==1){
            System.out.print(cnt);
            return ;
        }
        else if (num%2==0){
            cnt ++;
            recursion(num/2);
        }
        else if (num%2!=0){
            cnt++;
            recursion(num/3);
        }

    }
}

