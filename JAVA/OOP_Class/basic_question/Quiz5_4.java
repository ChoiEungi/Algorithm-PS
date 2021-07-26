import java.util.Scanner;

public class Quiz5_4 {
    public static void main(String[] args) {
        String str;
        char ch,temp;
        int i;
        int cnt = 0;
        Scanner input = new Scanner(System.in);
        str = input.next();
        ch = input.next().charAt(0);
        for (i=0;i<str.length();i++){
            temp = str.charAt(i);
            if (temp==ch){
                System.out.print(cnt) ;
                break;
            }
            cnt ++;

        }

        if (cnt==str.length()){
            System.out.print("No");
        }


    }
}