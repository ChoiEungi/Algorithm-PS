import java.util.Scanner;

public class Quiz9_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][5];

        int i,j ;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                arr[i][j]=0 ;
            }
        }
        arr[0][0] =1;
        arr[0][2] =1;
        arr[0][4] =1;


        for(i=1;i<5;i++){
            for(j=0;j<5;j++){
                if (j==0){
                    arr[i][j] = arr[i-1][j+1];
                }
                else if (j==4){
                    arr[i][j] = arr[i-1][j-1];
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
                }
            }
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
