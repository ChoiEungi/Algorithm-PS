import java.util.Scanner;

public class Quiz9_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] arr = new int[6];
        int i,temp,j=1 ;
        for (i=0;i<10;i++){
            temp = input.nextInt();
            arr[temp-1]++;
        }

        for (int a : arr){
            System.out.print(j+" : "+a+"번\n");
            j++;
        }

    }
}
