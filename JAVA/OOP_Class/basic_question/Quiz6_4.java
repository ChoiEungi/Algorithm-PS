import java.util.Scanner;

public class Quiz6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int j, ans=0;


        for (j=0;j<n;j++){
            int temp = input.nextInt();
            ans += temp ;

        }
        System.out.printf("%.2f",ans/(float)n);


    }
}
