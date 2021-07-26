import java.util.Scanner;

public class Quiz6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = input.nextInt();
        int i = input.nextInt() ;
        int j;


        for (j=Math.min(end,i);j<=Math.max(end,i);j++){
            System.out.print(j+" ");

        }


    }
}