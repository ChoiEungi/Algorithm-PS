package ifstactproject.stackpkg;

public class FixedStack implements IfCharStack{
    private char s[] ;
    private int toploc ;

    public FixedStack(int size) {
        s = new char[size];
        toploc = -1;
    }

    @Override
    public void push(char ch) {
        if (toploc == s.length-1){
            System.out.println("\n- 스택이 가득차 있음 -");
            return;
        }
        s[++toploc] = ch;
    }

    @Override
    public char pop() {
        if(toploc==-1){
            System.out.println("\n- 스택이 비어 있음-");
            return (char) 0;
        }
        return s[toploc--];
    }




}
