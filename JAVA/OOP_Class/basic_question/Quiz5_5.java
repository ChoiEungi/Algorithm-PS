import java.util.Scanner;

public class Quiz5_5 {
    public static void main(String[] args) {
        String str1,str2;
        Scanner input = new Scanner(System.in);
        str1 = input.next();
        str2 = input.next();
        if (str1.length()>=str2.length()){
            System.out.print(str1.length());
        }
        else {
            System.out.print(str2.length());
        }

    }
}
