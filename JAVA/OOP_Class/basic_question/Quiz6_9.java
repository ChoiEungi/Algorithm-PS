import java.util.Scanner;


public class Quiz6_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt() ;
        int i,j ;


        for (i=1;i<=p;i++){
            for (j=1;j<=p;j++){
                System.out.print("("+i+", "+j+") " );
            }
            System.out.println("");

        }



    }
}