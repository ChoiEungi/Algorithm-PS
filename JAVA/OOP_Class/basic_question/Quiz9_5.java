import java.util.Scanner;

public class Quiz9_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int i,j,sum;
        for (i=0;i<4;i++){
            System.out.print((i+1)+"반? ");
            for(j=0;j<3;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (i=0;i<4;i++){
            sum =0;
            for(j=0;j<3;j++){
                sum += arr[i][j];
            }
            System.out.print((i+1)+"반 : "+sum+"개\n");

        }

    }
}
