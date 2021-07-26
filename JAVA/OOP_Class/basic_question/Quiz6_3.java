import java.util.Scanner;

public class Quiz6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        num /= 5;
        int j, ans=0;


        for (j=1;j<=num;j++){
            ans += j*5;

        }
        System.out.println(ans);


    }
}
