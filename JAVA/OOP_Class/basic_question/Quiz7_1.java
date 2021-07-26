import java.util.Scanner;


public class Quiz7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,sum=0,cnt=0, temp ;


        for (i=0;i<20;i++){
            temp = input.nextInt();
            if (temp ==0){
                break;
            }
            sum += temp;
            cnt ++;
        }
        System.out.print(sum + " " + sum/cnt);



    }
}