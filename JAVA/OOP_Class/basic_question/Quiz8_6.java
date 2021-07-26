import java.util.Scanner;


public class Quiz8_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] array = {'J','U','N','G','O','L'};
        int i,temp=-1;
        char check = input.next().charAt(0);

        for(i=0;i<6;i++){
            if (array[i]==check){
                temp = i;
            }
        }

        if (temp==-1){
            System.out.println("없는 문자입니다.");
        }
        else {
            System.out.println(temp);
        }



    }
}