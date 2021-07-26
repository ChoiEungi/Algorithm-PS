import java.util.Scanner;

public class Quiz9_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int i ;
        arr[0] = input.nextInt();
        arr[1] = input.nextInt();

        for(i=0;i<8;i++){
            arr[i+2] = (arr[i] + arr[i+1])%10 ;

        }
        for (int a : arr){
            System.out.print(a+" ");
        }



    }
}
