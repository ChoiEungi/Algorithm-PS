import java.util.Scanner;

public class Quiz4_2 {
    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);

        num = input.nextInt();
        if (num==0){
            System.out.println("zero");

        }
        else if (num >0){
            System.out.println("plus");
        }
        else{
            System.out.println("minus");
        }

    }
}
