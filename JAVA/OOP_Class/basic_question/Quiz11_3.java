import java.util.Scanner;

public class Quiz11_3 {

    static int idx = 1;
    static int[] arr = new int[11] ; //n<=10;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        dice(n,m);
    }
    public static void dice (int level, int sum){
        int temp = 0;
        int i,k,j;

        for (i=1; i<=6 ;i++){

            arr[idx] = i ;

            if (idx==level){
                for (j =1;j<=level;j++){
                    temp += arr[j];
                }
                if (temp == sum){
                    for (k=1;k<=level;k++)
                    {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println("");
                }
                temp =0;
            }
            else {
                idx++;
                dice(level,sum);
                arr[level+1] = 1;
                idx --;
            }
        }


    }
}
