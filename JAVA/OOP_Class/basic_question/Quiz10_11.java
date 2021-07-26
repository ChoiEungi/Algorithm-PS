import java.util.Scanner;

public class Quiz10_11 {
    final static int N =7  ;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i;
        int [] arr = new int[N];
        for(i=0;i<N;i++){
            arr[i] = input.nextInt();
        }
        calArea(arr);
    }
    public static void calArea(int[] arr){
        int i,j;
        for (i=N-1;i>=N-3;i--){
            for(j=0;j<N-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
