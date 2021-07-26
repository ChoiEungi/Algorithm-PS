import java.util.Scanner;

public class Quiz9_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][2];

        int i,j ,avg,total=0;

        for (i=0;i<4;i++){
            for(j=0;j<2;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("가로평균 ");

        for (i=0;i<4;i++){
            avg =0;
            for(j=0;j<2;j++){
                avg += arr[i][j];
                total +=arr[i][j];
            }
            System.out.print(avg/2+" ");
        }
        System.out.println("");

        System.out.print("세로평균 ");
        for (i=0;i<2;i++){
            avg =0;
            for(j=0;j<4;j++){
                avg += arr[j][i];
            }
            System.out.print(avg/4+" ");
        }
        System.out.println("");
        System.out.print("전체평균 "+total/8);


    }
}
