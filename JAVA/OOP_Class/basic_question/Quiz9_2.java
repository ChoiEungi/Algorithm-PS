import java.util.Scanner;

public class Quiz9_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[11];
        int i,temp;
        while (true){
            temp = input.nextInt();
            if (temp==0){
                break;
            }
            arr[temp/10]++;
        }
        for(i=10;i>=0;i--){
            if (arr[i]>0){
                System.out.print(i*10+"점 이상 : "+arr[i]+"명\n");

            }


        }

    }
}
