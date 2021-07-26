import java.util.Scanner;


public class Quiz8_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[100];
        int i;
        int sum =0,cntMultiple =0;

        for(i=0;i<100;i++){
            array[i] = input.nextInt();
            if (array[i]==0){
                break;
            }
            if (array[i]%5==0){
                cntMultiple++;
                sum += array[i];

            }

        }
        System.out.printf("5의 배수 : %d개\n",cntMultiple);
        System.out.printf("합계 : %d\n",sum);
        System.out.printf("평균 : %.1f\n",sum/(float)cntMultiple);



    }
}