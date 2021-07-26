import java.util.Scanner;


public class Quiz8_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] array = new char[10];
        int i;



        for(i=0;i<10;i++){
            array[i] = input.next().charAt(0);
        }

        for(i=9;i>=0;i--){
            System.out.print(array[i]+" ");
        }





    }
}