package 双向链表;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Student s1 = new Student(4,"A","1ST");
        Student s2 = new Student(98,"B","2ND");
        Student s3 = new Student(92,"C","3RD");
        Student s4 = new Student(83,"D","4TH");
        Student s5 = new Student(64,"E","6TH");
        Student s6 = new Student(14,"F","1st");

        //测试添加学生
        doubleLinkedList.addStudent(s1);
        doubleLinkedList.addStudent(s2);
        doubleLinkedList.addStudent(s3);
        doubleLinkedList.addStudent(s4);
        doubleLinkedList.addStudent(s5);
        doubleLinkedList.addStudent(s6);
        doubleLinkedList.showStudents();
        System.out.println("===============");

        //测试删除学生
        doubleLinkedList.deleteStudent(14);
        doubleLinkedList.deleteStudent(98);
        doubleLinkedList.deleteStudent(77);
        doubleLinkedList.deleteStudent(9);
        doubleLinkedList.showStudents();
        System.out.println("===============");

        //测试更新学生
        doubleLinkedList.updateStudent(new Student(4,"K","8TH"));
        doubleLinkedList.updateStudent(new Student(22,"K","8TH"));
        doubleLinkedList.updateStudent(new Student(92,"O","8TH"));
        doubleLinkedList.showStudents();
        System.out.println("===============");


    }

}
