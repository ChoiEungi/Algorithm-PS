import java.util.Scanner;

public class Quiz10_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        printRect(start);


    }
    public static void printRect(int num){
        int i,j;
        for (i=1;i<=num;i++){
            for (j=1;j<=num;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
}
