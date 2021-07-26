import java.util.Scanner;


public class Quiz8_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[100];
        int i;
        int cnt =0;

        for(i=0;i<100;i++){
            array[i] = input.nextInt();
            if (array[i]==0){
                break;
            }
            if (array[i]%2==0){
                array[i]/=2;

            }
            else{
                array[i]*=2;
            }
            cnt ++;

        }
        System.out.print(cnt+" 개\n");
        for(i=0;i<cnt;i++){
            System.out.print(array[i]+" ");
        }



    }
}