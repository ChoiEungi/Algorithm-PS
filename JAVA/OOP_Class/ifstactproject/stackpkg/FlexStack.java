package ifstactproject.stackpkg;

public class FlexStack implements IfCharStack {
    private char s[] ;
    private int toploc ;

    public FlexStack(int size) {
        s = new char[size];
        toploc = -1;
    }
    @Override
    public void push(char ch) {
        if (toploc == s.length-1){
            char t[] = new char[2*s.length];
            for (int i=0; i<s.length;i++){
                t[i] = s[i];
            }
            s= t;

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
