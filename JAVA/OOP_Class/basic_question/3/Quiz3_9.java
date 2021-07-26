import java.util.Calendar;

public class Quiz3_9 {
    public static void main(String[] args){
        int a = 0;
        Calendar cal = Calendar.getInstance();

        a = cal.get(Calendar.YEAR)-1900; // a:0
        a += cal.get(Calendar.MONTH); // a:121
        a += cal.get(Calendar.DATE);

        System.out.printf("%d %d %d\n", 0, 121, 139); // a:139
    }
}
