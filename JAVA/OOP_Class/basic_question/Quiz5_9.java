import java.util.Scanner;

public class Quiz5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,cntOdd=0,cntEven=0;
        int num=-1 ;


        while (num!=0){
            num = input.nextInt();
            if (num%2==0 && num!=0){
                cntEven++;
            }
            else if (num%2!=0){
                cntOdd++;
            }

        }
        System.out.printf("홀수 : %d개\n", cntOdd);
        System.out.printf("짝수 : %d개\n", cntEven);

    }
}
