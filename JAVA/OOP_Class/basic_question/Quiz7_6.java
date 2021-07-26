import java.util.Scanner;


public class Quiz7_6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,p,i;

        p = input.nextInt();


        for (i=0;i<p;i++){
            for (j=0;j<2*p-2*i-2;j++) {
                System.out.print(" ");
            }
            for (j=0;j<i+1;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println("");
        }







    }
}