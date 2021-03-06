package 双向链表;

/**
 * 需求：1. 使用双向链表实现"学生管理系统"完成对学生的增删改查操作
 *      2. 在链表使用学生编号的自动排序(升序)
 */
public class Student {
    private int id;
    private String name;
    private String grade;
    private Student next_student;
    private Student pre_student;

    public Student() {
    }


    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getNext_student() {
        return next_student;
    }

    public void setNext_student(Student next_student) {
        this.next_student = next_student;
    }

    public Student getPre_student() {
        return pre_student;
    }

    public void setPre_student(Student pre_student) {
        this.pre_student = pre_student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
