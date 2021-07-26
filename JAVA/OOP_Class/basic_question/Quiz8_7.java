import java.util.Scanner;


public class Quiz8_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[100];
        int i;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(i=0;i<100;i++){
            array[i] = input.nextInt();
            if (array[i]==999){
                break;
            }
            if (max<array[i]){
                max = array[i];
            }
            if (min>array[i]){
                min = array[i];
            }

        }
        System.out.print("최대값 : "+ max+ "\n");
        System.out.print("최소값 : "+ min +"\n");


    }
}