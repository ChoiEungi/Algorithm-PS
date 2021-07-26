import java.util.Scanner;

public class Quiz5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt=0;
        int num;


        while (true){
            num = input.nextInt();
            if(num == 0){
                break;
            }

            if (num%3!=0&&num%5!=0){
                cnt ++;

            }

        }
        System.out.println(cnt);

    }
}
