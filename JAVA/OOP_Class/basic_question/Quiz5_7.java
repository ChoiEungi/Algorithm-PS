import java.util.Scanner;

public class Quiz5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] array = str.split("\\s");
        int i;

        for(i=0; i< array.length;i++){
            System.out.printf("%d. %s\n",i+1,array[i]);
        }

    }
}
