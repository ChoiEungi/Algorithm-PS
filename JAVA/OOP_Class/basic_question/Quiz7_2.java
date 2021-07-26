import java.util.Scanner;


public class Quiz7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,cnt=1, temp ;

        num = input.nextInt();


        while (true){
            if (num*cnt%10 == 0){
                System.out.print(num*cnt);
                break;
            }

            if (num*cnt>=100){
                break;
            }

            System.out.print(num*cnt+" ");
            cnt ++;
        }




    }
}