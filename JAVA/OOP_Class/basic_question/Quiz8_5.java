import java.util.Scanner;


public class Quiz8_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] array = new double [6];
        int i;
        double sum=0;


        for(i=0;i<6;i++){
            array[i] = input.nextDouble();
            sum+=array[i];
        }
        System.out.printf("%.1f",sum/6.0);



    }
}