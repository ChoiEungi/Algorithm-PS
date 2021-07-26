import java.util.Scanner;


public class Quiz7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,p,i;

        p = input.nextInt();


        for (i=1;i<=p;i++){
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i=p-1;i>=1;i--){
            for (j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}