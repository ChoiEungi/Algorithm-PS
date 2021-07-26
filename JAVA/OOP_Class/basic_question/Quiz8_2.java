import java.util.Scanner;


public class Quiz8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [5];
        int i;



        for(i=0;i<5;i++){
            array[i] = input.nextInt();
        }

        System.out.println(array[0]+array[2]+array[4]);





    }
}