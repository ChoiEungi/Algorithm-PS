import java.util.Scanner;


public class Quiz8_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array = new int[n];
        int i,minIdx,j,temp;

        for (i=0;i<n;i++){
            array[i] = input.nextInt();
        }

        for(i=0;i<n;i++) {
            minIdx = i;
            for (j = i + 1; j < n; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }

            }
            temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        for (i=n-1;i>=0;i--){
            System.out.println(array[i]);
        }


    }
}