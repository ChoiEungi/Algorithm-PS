import java.util.Scanner;

public class Quiz11_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n==1) {
            System.out.print("1");
            return ;
        }
        else if(n==2) {
            System.out.print("2");
            return;

        }

        recursion(1,2,n);
    }
    public static void recursion(int firstNum,int secNum,int limit){
        int val = (firstNum*secNum)%100;

        if (limit==3) {
            System.out.print(val);
            return;
        }

        recursion(secNum,val,limit-1);


    }
}
