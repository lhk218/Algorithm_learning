package 单链表;

/**
 * 需求：1. 使用带 head 头的单向链表实现"学生管理系统"完成对学生的增删改查操作
 * 2. 在链表使用学生编号的自动排序(升序)
 */
public class SingleLinkedList {
    private Student head = new Student(0, "", "");


    /**
     * 方法：增加学生
     */
    public void addStudent(Student student) {
        Student temp = head;
        while (true) {
            if (temp.getNext_student() == null) {
                temp.setNext_student(student);
                break;
            } else {
                if ((temp.getNext_student().getId()) < student.getId()) {
                    temp = temp.getNext_student();
                } else if ((temp.getNext_student().getId()) == student.getId()) {
                    System.out.println("The student number is already exist!");
                    break;
                } else {
                    student.setNext_student(temp.getNext_student());
                    temp.setNext_student(student);
                    break;
                }
            }
        }
    }

    /**
     * 方法：删除学生
     * 返回值：
     * 0：不存在该学生，删除失败
     * 1：删除成功
     */
    public Student deleteStudent(int sid) {

        Student temp = head;
        if (head.getNext_student() == null) {
            return null;
        } else {
            while (true) {
                if ((temp.getNext_student().getId()) != sid) {
                    temp = temp.getNext_student();
                } else if ((temp.getNext_student().getId()) == sid) {
                    if (temp.getNext_student().getNext_student()==null){
                        temp.setNext_student(null);
                        break;
                    }
                    temp.setNext_student(temp.getNext_student().getNext_student());
                    break;
                }
            }
            return temp.getNext_student();
        }
    }

    /**
     * 方法：更新学生，但id不变
     */
    public Student updateStudent(Student student) {
        Student temp = head;
        while (true) {
            if (temp.getNext_student() == null) {
                System.out.println("查询失败！");
                break;
            }
            if ((temp.getNext_student().getId()) != student.getId()) {
                temp = temp.getNext_student();
            } else if ((temp.getNext_student().getId()) == student.getId()) {
                temp.getNext_student().setName(student.getName());
                temp.getNext_student().setGrade(student.getGrade());
                break;
            }
        }
        return temp.getNext_student();
    }

    /**
     * 方法：打印所有学生信息
     */
    public void showStudent(SingleLinkedList singleLinkedList) {
        Student temp = head;
        while (temp.getNext_student() != null) {
            System.out.println(temp.getNext_student());
            temp = temp.getNext_student();
        }
    }


}
