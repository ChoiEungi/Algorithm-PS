import java.util.Scanner;

class Member{
    String name;
    String callNum;
    String location;
    int check = 0;
    Member(String na, String tel, String addr){
        name = na;
        callNum = tel;
        location = addr;
        }

    void checkFast(String na, String tel, String addr){
        check = name.compareTo(na);
        if (check>=0){
            name = na;
            callNum = tel;
            location = addr;

        }

    }

}

public class Quiz12_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Member fast = new Member(input.next(),input.next(),input.next());
        fast.checkFast(input.next(),input.next(),input.next());
        fast.checkFast(input.next(),input.next(),input.next());
        System.out.print("이름 : "+fast.name+"\n");
        System.out.print("전화번호 : "+fast.callNum+"\n");
        System.out.print("주소 : "+fast.location+"\n");


    }

}
