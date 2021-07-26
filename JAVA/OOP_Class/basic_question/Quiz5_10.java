import java.util.Scanner;

public class Quiz5_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int calSum=0,cnt=0;
        double calAvg=0;
        int num=0 ;


        while (0<=num && num<=100){
            num = input.nextInt();
            if (0<=num && num<=100){
                cnt ++ ;
                calSum += num;
                calAvg = (float)calSum/cnt;
            }

        }
        System.out.printf("합계 : %d점\n", calSum);
        System.out.printf("평균 : %.1f점\n", calAvg);

    }
}
