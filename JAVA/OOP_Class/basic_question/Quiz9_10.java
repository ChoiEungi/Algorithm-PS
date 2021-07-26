import java.util.Scanner;

public class Quiz9_10{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char[][] arr = new char[3][5];
        char temp =0;
        int i,j ;
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                arr[i][j]=input.next().charAt(0) ;
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<5;j++){
                System.out.print((char)(arr[i][j]+32)+" "); ;
            }
            System.out.println("");
        }


    }
}