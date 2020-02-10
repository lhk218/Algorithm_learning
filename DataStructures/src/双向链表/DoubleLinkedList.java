package 双向链表;

/**
 * 需求：1. 使用双向链表实现"学生管理系统"完成对学生的增删改查操作
 *      2. 在链表使用学生编号的自动排序(升序)
 */

public class DoubleLinkedList {

    private Student head = new Student(0, "", "");;

    /**
     * 方法：增加学生
     */
    public void addStudent(Student student) {
        Student temp = head;
        //当链表为空时，直接添加在head后面
        if (head.getNext_student()==null){
            head.setNext_student(student);
            student.setPre_student(head);
        }else {
            temp = temp.getNext_student();
            //当链表不为空时，循环判断
            while (true) {
                //先排空，适应将student添加到链表末端的情况
                if (temp.getNext_student() != null) {
                    if (temp.getId() < student.getId()) {
                        temp = temp.getNext_student();
                    } else if (temp.getId() == student.getId()) {
                        System.out.println("该ID已存在，添加失败");
                        break;
                    } else {
                        temp.getPre_student().setNext_student(student);
                        student.setPre_student(temp.getPre_student());
                        student.setNext_student(temp);
                        temp.setPre_student(student);
//                        temp.getNext_student().setPre_student(student);
//                        student.setNext_student(temp.getNext_student());
//                        temp.setNext_student(student);
//                        student.setPre_student(temp);
                        break;
                    }
                }else {
                    if (temp.getId() < student.getId()) {
                        temp.setNext_student(student);
                        student.setPre_student(temp);
                        break;
                    }else {
                        temp.getPre_student().setNext_student(student);
                        student.setPre_student(temp.getPre_student());
                        student.setNext_student(temp);
                        temp.setPre_student(student);
                        break;
                    }
                }

            }
        }
    }

    /**
     * 方法：删除学生
     */
    public Student deleteStudent(int id){
        Student temp = head;
        if (head.getNext_student()==null){
            return null;
        }
        temp = temp.getNext_student();
        while (true){
             if (temp.getId()==id){
                 if (temp.getNext_student()!=null) {
                     temp.getPre_student().setNext_student(temp.getNext_student());
                     temp.getNext_student().setPre_student(temp.getPre_student());
                     System.out.println("成功删除：" + temp);
                     return temp;
                 }else {
                     temp.getPre_student().setNext_student(null);
                     System.out.println("成功删除：" + temp);
                     return temp;
                 }
             }else {
                 if (temp.getNext_student()==null){
                     System.out.printf("不存在学号为%d的学生，删除失败！\n",id);
                     return null;
                 }else {
                     temp = temp.getNext_student();
                 }

             }
        }
    }

    /**
     * 方法：更新学生，但id不变
     */
    public Student updateStudent(Student student){
        Student temp = head;
        if (head.getNext_student()==null){
            return null;
        }
        temp = temp.getNext_student();
        while (true){
            if (temp.getId()==student.getId()){
                temp.setGrade(student.getGrade());
                temp.setName(student.getName());
                System.out.println("更新成功："+temp);
                return temp;
            }else {
                if (temp.getNext_student()==null){
                    System.out.printf("不存在学号为%d的学生，更新失败！\n",student.getId());
                    return null;
                }else {
                    temp = temp.getNext_student();
                }
            }
        }
    }

    /**
     * 方法：打印所有学生信息
     */
   /* public void showStudents(){
        if (head.getNext_student()==null){
            System.out.println("链表为空！");
        }
        temp = temp.getNext_student();
        int count = 1;
        while (true){
            if (temp.getNext_student()== null){
                break;
            }else {
                temp = temp.getNext_student();
                count++;
            }
        }
        temp = head.getNext_student();
        for (int i = 0; i < count; i++ ){
            System.out.println(temp);
            temp = temp.getNext_student();
        }
    }*/
    public void showStudents() {
        Student temp = head;
        while (temp.getNext_student() != null) {
            System.out.println(temp.getNext_student());
            temp = temp.getNext_student();
        }
    }

}
