import java.util.Scanner;

class Body{
    double height;
    double weight;

    Body(double h, double w){
        height =h ;
        weight = w;
    }
}

public class Quiz12_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("아버지의 키와 몸무게? ");
        Body dad = new Body(input.nextDouble(),input.nextDouble());
        System.out.print("어머니의 키와 몸무게? ");
        Body mom = new Body(input.nextDouble(),input.nextDouble());
        System.out.println("학생의 키 : "+((int)((dad.height+mom.height)/2)+5)+"cm");
        System.out.printf("학생의 몸무게 : %.1fkg",(dad.weight+ mom.weight)/2.0-4.5);




    }

}
