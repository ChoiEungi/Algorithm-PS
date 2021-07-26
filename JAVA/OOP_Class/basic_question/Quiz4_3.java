import java.util.Scanner;

public class Quiz4_3 {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);

        year = input.nextInt();
        if (year%400 ==0){
            System.out.println("윤년");
        }
        else if (year%4==0&&year%100!=0){
            System.out.println("윤년");
        }
        else{
            System.out.println("평년");
        }

    }
}
