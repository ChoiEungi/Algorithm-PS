import java.util.Scanner;

public class Quiz5_6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer str = new StringBuffer(input.next());
        int i;
        //Scanner input = new Scanner(System.in);

        while (str.length()!=1){
            i = input.nextInt();
            if (i>str.length()){
                str.deleteCharAt(str.length()-1);
            }
            else {
                str.deleteCharAt(i-1);

            }
            System.out.println(str);
        }


    }
}
