import java.util.Scanner;


public class Quiz7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,p,i;
        int num = 1;


        p = input.nextInt();


        for (i=0;i<p;i++){
            for (j=0;j<i;j++) {
                System.out.print("  ");
            }

            for (j=0;j<p-i;j++){
                System.out.print(num+" ");
                num ++;
            }
            System.out.println("");
        }







    }
}