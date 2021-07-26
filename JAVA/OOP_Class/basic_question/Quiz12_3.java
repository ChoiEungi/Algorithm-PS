import java.util.Scanner;

class Rectangular{
    int x1;
    int y1;
    int x2;
    int y2;

    Rectangular(int a, int b, int c, int d){
        x1 = a;
        y1 = b;
        x2= c;
        y2 = d;
    }

}

public class Quiz12_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rectangular first = new Rectangular(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        Rectangular second = new Rectangular(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());
        Rectangular biggest = new Rectangular(first.x1,first.y1, first.x2, first.y2);
        if (first.x1> second.x1) biggest.x1 = second.x1;
        if (first.y1> second.y1) biggest.y1 = second.y1;
        if (first.x2< second.x2) biggest.x2 = second.x2;
        if (first.y2< second.y2) biggest.y2 = second.y2;

        System.out.printf("%d %d %d %d",biggest.x1,biggest.y1,biggest.x2,biggest.y2);


    }

}
