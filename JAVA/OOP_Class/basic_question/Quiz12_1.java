import java.util.Scanner;
class Info{
    String name;
    String callNum;
    String location;

    Info(String na, String num, String loc){
        name = na;
        callNum = num;
        location = loc;
    }

}

public class Quiz12_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Info a = new Info(input.next(),input.next(),input.next());
        System.out.print("이름 : "+a.name+"\n");
        System.out.print("전화번호 : "+a.callNum+"\n");
        System.out.print("주소 : "+a.location+"\n");

        return;
    }

}

