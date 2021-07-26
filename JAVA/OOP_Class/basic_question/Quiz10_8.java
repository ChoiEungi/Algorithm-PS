import java.util.Scanner;

public class Quiz10_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        absSum(arr);

    }
    public static void absSum(int[] arr){
        int i, sum=0;
        for(i=0;i<arr.length;i++){
            sum += Math.abs(arr[i]);
        }
        System.out.println(sum);

    }
}
