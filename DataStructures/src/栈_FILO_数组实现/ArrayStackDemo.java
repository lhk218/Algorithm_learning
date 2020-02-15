package 栈_FILO_数组实现;

import java.util.Scanner;

public class ArrayStackDemo {
    public static void main(String[] args) {
        System.out.println("请输入你想要创建的栈容量：");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayStack arrayStack = new ArrayStack(size);

        while (true){
            System.out.println("----------------------------");
            System.out.println("show: 显示栈");
            System.out.println("push: 数据入栈");
            System.out.println("pop: 数据出栈");
            System.out.println("exit: 退出程序");
            System.out.println("----------------------------");

            String input = sc.nextLine();
            switch (input){
                case "show":
                    arrayStack.show();
                    break;
                case "push":
                    System.out.println("请输出入栈的数据：");
                    int value = sc.nextInt();
                    arrayStack.push(value);
                    break;
                case "pop":
                    arrayStack.pop();
                    break;
                case "exit":
                    sc.close();
                    System.out.println("退出程序成功！");
                    System.exit(0);
            }
        }
    }
}
