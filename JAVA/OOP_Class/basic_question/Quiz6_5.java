import java.util.Scanner;

public class Quiz6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int j, cntOdd=0,cntEven=0;


        for (j=0;j<n;j++){
            int temp = input.nextInt();
            if (temp%2==0){
                cntEven += 1 ;
            }
            else{
                cntOdd +=1;
            }

        }
        System.out.printf("짝수 : %d개\n",cntEven);
        System.out.printf("홀수 : %d개\n",cntOdd);



    }
}
