class Stack {
    char arr[] ;
    int top ;

    Stack(int size){
        arr = new char[size];
        top = -1;
    }

    Stack(Stack ob){
        top = ob.top;
        arr = new char[ob.arr.length];
        for(int i=0;i<ob.arr.length;i++){
            arr[i] = ob.arr[i];
        }
    }

    Stack(char a[]){
        top = -1;
        arr = new char[a.length];
        for (int i=0;i<a.length;i++){
            push(a[i]);
        }

    }
    void push(char ch){
        if(top == arr.length-1) {
            System.out.println("\n- 스택이 가득차 있음 -");
            return;
        }
        arr[++top] = ch;
    }

    char pop(){
        if(top==-1){
            System.out.println("\n- 스택이 비어 있음-");
            return (char) 0;
        }
        return arr[top--];

    }

}
