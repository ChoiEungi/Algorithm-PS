import java.util.Scanner;

public class Quiz6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt() ;
        int q = input.nextInt() ;
        int i,j ;


        for (i=1;i<=p;i++){
            for (j=1;j<=q;j++){
                System.out.print((j*i)+" ");
            }
            System.out.println("");

        }



    }
}