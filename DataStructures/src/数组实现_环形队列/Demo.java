package 数组实现_环形队列;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入你想要创建的环形队列容量：");
        Scanner sc = new Scanner(System.in);
        int initial_cap = sc.nextInt();
        CircleQueue queue = new CircleQueue(initial_cap);

        while (true){
            System.out.println("----------------------------");
            System.out.println("s(show): 显示队列");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("d(delete): 从队列头删除数据");
            System.out.println("e(exit): 退出程序");
            System.out.println("----------------------------");
            char input = sc.next().charAt(0);

            switch (input) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入需要添加的元素：");
                    int add = sc.nextInt();
                    queue.add(add);
                    break;
                case 'd':
                    int delete = queue.delete();
                    System.out.println("删除成功，本次删除的元素为: " + delete);
                    break;
                case 'e':
                    sc.close();
                    System.out.println("感谢使用本系统，程序已退出！");
                    System.exit(0);


            }
        }
    }
}
