package 单向环形链表;

/**
 * 需求：1. 使用单向环形链表解决Josephus问题
 *      2. Josephus问题：
 *          设编号为 1，2，… n 的 n 个人围坐一圈，约定编号为 k（1<=k<=n）的人从 1 开始报数，数到 m 的那个人出列，
 *          它的下一位又从 1 开始报数，数到 m 的那个人又出列，依次类推，直到所有人出列为止，由此 产生一个出队编号的序列。
 */
public class CircleLinkedListDemo {
    public static void main(String[] args) {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        //测试几组用例
        circleLinkedList.Josephus(1,2,5);
        /*
        期望值
        第1个出队编号:2
        第2个出队编号:4
        第3个出队编号:1
        第4个出队编号:5
        第5个出队编号:3
        */
        System.out.println("======================");


        circleLinkedList.Josephus(3,2,9);
        /*
        期望值
        第1个出队编号:4
        第2个出队编号:6
        第3个出队编号:8
        第4个出队编号:1
        第5个出队编号:3
        第6个出队编号:7
        第7个出队编号:2
        第8个出队编号:9
        第9个出队编号:5
        */
        System.out.println("======================");

    }
}
