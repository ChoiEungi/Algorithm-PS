import java.util.Scanner;

public class Quiz9_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        int i,j ;

        System.out.println("첫 번째 배열 입력");
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("두 번째 배열 입력");

        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                arr2[i][j] = input.nextInt();
            }
        }

        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(arr1[i][j]*arr2[i][j] +" ");
            }
            System.out.println();
        }


    }
}
