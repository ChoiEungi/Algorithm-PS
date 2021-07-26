import java.util.Scanner;

public class Quiz6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int end = input.nextInt();
        int i = input.nextInt() ;
        int j,sum=0,cnt=0;


        for (j=Math.min(end,i);j<=Math.max(end,i);j++){
            if (j%3==0 || j%5==0){
                sum += j;
                cnt += 1;
            }

        }
        System.out.printf("합계 : %d\n",sum);
        System.out.printf("평균 : %.1f\n",sum/(float)cnt);



    }
}