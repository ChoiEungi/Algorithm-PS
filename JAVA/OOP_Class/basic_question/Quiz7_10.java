import java.util.Scanner;

public class Quiz7_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p,i,j ;
        int num = 1 ;


        p = input.nextInt();

        for (i=0; i<p; i++ ){
            for (j=0;j<p;j++){

                if (num>= 10){
                    num = 1;
                }
            }
            System.out.println("");

        }

    }
}
