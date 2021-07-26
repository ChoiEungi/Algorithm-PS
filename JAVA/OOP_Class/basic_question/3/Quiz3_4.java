import java.util.Scanner;

public class Quiz3_4 {
    public static void main(String[] args){
        int a,b;
        Scanner input = new Scanner(System.in);

        a= input.nextInt();
        b= input.nextInt();
        ++a;
        System.out.printf("%d %d\n",a,b);
        b--;
        System.out.printf("%d %d\n",a,b);

    }
}
