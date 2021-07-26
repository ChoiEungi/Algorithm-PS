import java.util.Scanner;


public class Quiz8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [100];
        int i,temp,cnt=0;


        for(i=0;i<100;i++){
            temp = input.nextInt();
            if (temp == -1){
                break;
            }
            cnt++ ;
            array[i] = temp;
        }
        if (cnt>2){
            System.out.print(array[cnt-3]+" "+array[cnt-2]+" "+array[cnt-1]);
        }
        else if (cnt == 2) {
            System.out.print(array[cnt - 2] + " " + array[cnt - 1]);
        }
        else if (cnt == 1) {
            System.out.print(array[cnt - 1]);
        }




    }
}