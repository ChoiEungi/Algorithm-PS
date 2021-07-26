import java.util.Scanner;


public class Quiz6_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt() ;
        int q = input.nextInt() ;
        int i,j ;

        for (j=1;j<=9;j++){
            if (p>q){
                for (i=p;i>=q;i--){
                    System.out.printf("%d * %d = %2d   ",i,j,i*j);
                }
                System.out.println("");
            }
            else {
                for (i=p;i<=q;i++){
                    System.out.printf("%d * %d = %2d   ",i,j,i*j);
                }
                System.out.println("");
            }

        }

    }
}