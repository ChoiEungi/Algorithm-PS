import java.util.Scanner;


public class Quiz7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,p,i;
        char a = 65;
        int num = 0;


        p = input.nextInt();


        for (i=0;i<p;i++){
            for (j=0;j<p-i;j++) {
                System.out.print(a+" ");
                a++;
            }

            for (j=0;j<i;j++){
                System.out.print(num+" ");
                num ++;
            }
            System.out.println("");
        }







    }
}