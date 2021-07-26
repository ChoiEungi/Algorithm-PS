import java.util.Scanner;

class Total{
    String name;
    int score1;
    int score2;
    int score3;
    int sum;
    Total(){}
    Total(String na,int a,int b,int c){
        name = na;
        score1 = a;
        score2 = b;
        score3 = c;
        sum = a+b+c;
    }
}

public class Quiz12_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Total[] people = new Total[n];
        for (int i=0;i<n;i++){
            people[i] = new Total(input.next(),input.nextInt(), input.nextInt(), input.nextInt());
        }

        int idxMin;
        Total temp = new Total();
        for (int i=0; i<n-1;i++){
            idxMin = i;
            for(int j=i+1;j<n;j++){
                if (people[j].sum>people[idxMin].sum) idxMin=j;
            }
            temp = people[i];
            people[i] = people[idxMin];
            people[idxMin] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(people[i].name+" ");
            System.out.print(people[i].score1+" ");
            System.out.print(people[i].score2+" ");
            System.out.print(people[i].score3+" ");
            System.out.print(people[i].sum+" ");
            System.out.println("");
        }




    }

}