import java.util.Scanner;

public class Quiz9_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[10][10];
        int i,j ,end=0;
        end = input.nextInt();

        for(i=0;i<end;i++){
            for(j=0;j<1;j++){
                arr[i][j]=1;
                arr[i][i]=1;
            }
        }
        for(i=2;i<end;i++){
            for(j=1;j<i;j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        for(i=end-1;i>=0;i--){
            for(j=i;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
