import java.util.Scanner;

public class Quiz10_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int i,j;
        for (i=0;i<arr.length;i++){
            for (j=0;j<arr.length;j++){
                arr[i][j]=input.nextInt();
            }
        }

        calculator(arr);

    }
    public static void calculator(int[][] arr){
        int i,j,temp,totalSum=0;
        for (i=0;i<arr.length;i++){
            temp =0;
            for(j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
                temp += arr[i][j];
            }
            System.out.print(temp);
            totalSum+=temp;
            System.out.println("");
        }
        for (i=0;i<arr.length;i++){
            System.out.print(arr[0][i]+arr[1][i]+arr[2][i]+" ");
        }
        System.out.print(totalSum);

    }
}
