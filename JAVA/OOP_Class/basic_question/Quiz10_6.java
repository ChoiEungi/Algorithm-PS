import java.util.Scanner;

public class Quiz10_6 {
    public static void main(String[] args){
        int [] temp;
        temp = input();
        quickSort(temp,0,temp.length-1);
        output(temp);

    }
    //input method
    public static int[] input(){
        Scanner input = new Scanner(System.in);
        int i;
        int n = input.nextInt();
        int[] arr = new int[n];
        for (i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    //output method
    public static void output(int[] arr){
        int i;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
    }

    //In java, array is call by value-reference. So we can use void type method in quick sort
    public static void quickSort(int[] arr, int start, int end){
        if(start>=end) return;
        int pivot = start ;
        int left = start + 1 ;
        int right = end;
        while (left<=right){
            while(left<= end && arr[left] <= arr[pivot]) left++;
            while(right>start && arr[right]>= arr[pivot]) right--;
            if (left>right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        quickSort(arr,start,right-1);
        quickSort(arr,right+1,end);

    }
}
