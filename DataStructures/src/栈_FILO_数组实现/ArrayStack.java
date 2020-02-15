package 栈_FILO_数组实现;

public class ArrayStack {
    private int max_size;
    private int[] stack;
    private int top = -1;

    public ArrayStack() {
        this.max_size = 10;
    }

    public ArrayStack(int max_size) {
        this.max_size = max_size;
        stack = new int[max_size];
    }


    /**
     * 方法：判断栈是否为空
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 方法：判断栈是否满
     */
    public boolean isFull(){
        return top == max_size - 1;
    }

    /**
     * 方法：数据入栈（push方法）
     */
    public void push(int value){
        if (isFull()){
            System.out.println("栈已满，无法加入数据！");
            return;
        }
        top++;
        stack[top] = value;
    }

    /**
     * 方法：数据出栈（pop方法）
     */
    public void pop(){
        if (isEmpty()){
            System.out.println("栈为空，无法取出数据！");
            return ;
        }
        int value = stack[top];
        System.out.println("ArrayStack[" +top + "]="+stack[top]+";");
        top--;
    }

    /**
     * 方法： 显示栈
     */
    public void show(){
        if (isEmpty()){
            System.out.println("栈为空！");
            return;
        }
        for (int i = top; i > -1; i--){
            System.out.println("ArrayStack[" +i + "]="+stack[i]+";");
        }
    }
}
