import java.util.Scanner;


public class Quiz8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [10];
        int i,oddSum=0,evenSum=0;



        for(i=0;i<10;i++){
            array[i] = input.nextInt();
        }

        for(i=0;i<10;i++){
            if(i%2==0){
                oddSum+=array[i];
            }
            else {
                evenSum+=array[i];
            }
        }
        System.out.print("홀수 번째 합 : "+oddSum+"\n");
        System.out.print("짝수 번째 합 : "+evenSum+"\n");




    }
}