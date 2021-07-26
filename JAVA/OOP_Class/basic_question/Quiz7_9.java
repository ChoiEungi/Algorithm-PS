import java.util.Scanner;


public class Quiz7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,p,i,k;


        p = input.nextInt();


        for (i=0;i<p;i++){
            for (j=0;j<=i;j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }

        for (i=1;i<p;i++){
            for (k=0; k<i; k++){
                System.out.print("  ");
            }

            for (j=0;j<p-i;j++){
                System.out.print("# ");
            }
            System.out.println("");
        }





    }
}