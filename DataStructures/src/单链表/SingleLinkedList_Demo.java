package 单链表;

/**
 * 需求：1. 使用带 head 头的单向链表实现"学生管理系统"完成对学生的增删改查操作
 *      2. 在链表使用学生编号的自动排序(升序)
 */
public class SingleLinkedList_Demo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList =new SingleLinkedList();
        Student s1 = new Student(24,"A","1ST");
        Student s2 = new Student(78,"B","2ND");
        Student s3 = new Student(12,"C","3RD");
        Student s4 = new Student(23,"D","4TH");
        Student s5 = new Student(4,"E","6TH");
        Student s6 = new Student(124,"F","1st");

        //测试增加学生
        singleLinkedList.addStudent(s1);
        singleLinkedList.addStudent(s2);
        singleLinkedList.addStudent(s3);
        singleLinkedList.addStudent(s4);
        singleLinkedList.addStudent(s5);
        singleLinkedList.addStudent(s6);
        singleLinkedList.showStudent(singleLinkedList);
        System.out.println("=======================");

        //测试删除学生
        singleLinkedList.deleteStudent(78);
        singleLinkedList.showStudent(singleLinkedList);
        System.out.println("=======================");

        //测试修改学生
        Student up = new Student(24,"Kobe","5TH");
        singleLinkedList.updateStudent(up);
        singleLinkedList.showStudent(singleLinkedList);
        System.out.println("=======================");
        Student no = new Student(888,"N","9TH");
        singleLinkedList.updateStudent(no);
        singleLinkedList.showStudent(singleLinkedList);
        System.out.println("=======================");
    }
}
