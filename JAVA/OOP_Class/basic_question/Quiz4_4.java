import java.util.Scanner;

public class Quiz4_4 {
    public static void main(String[] args){
        int num;
        String animal;
        Scanner input = new Scanner(System.in);
        System.out.println("1. 개");
        System.out.println("2. 고양이");
        System.out.println("3. 병아리");
        System.out.printf("영어로 알고 싶은 번호를 입력하세요. ");

        num = input.nextInt();

        switch (num){
            case 1: animal = "dog";
            break;

            case 2: animal = "cat";
            break;

            case 3: animal = "chick";
            break;
            default: animal = "I don't know";
            break;
        }
        System.out.print(animal);
    }
}
