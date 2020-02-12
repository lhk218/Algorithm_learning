package 单向环形链表;


/**
 * 需求：1. 使用单向环形链表解决Josephus问题
 *      2. Josephus问题：
 *          设编号为 1，2，… n 的 n 个人围坐一圈，约定编号为 k（1<=k<=n）的人从 1 开始报数，数到 m 的那个人出列，
 *          它的下一位又从 1 开始报数，数到 m 的那个人又出列，依次类推，直到所有人出列为止，由此 产生一个出队编号的序列。
 */
public class CircleLinkedList {
    private Person first = null;
    private Person current = null;


    /**
     * 方法：指定环形链表中的人数，并创建对应的环形链表
     *      (每个元素按id大小指向下一个，最后一个指向第一个)
     */
    public void addPerson(int num){

        if (num < 1){
            System.out.println("人数设定小于1，创建失败");
            return;
        }
        //循环添加链表中的人数
        for (int i = 1; i <= num; i++){
            Person person = new Person(i);
            if (i==1){
                first = person;
                current = person;
                current.setNext_person(first);
            }else {
                current.setNext_person(person);
                current = person;
                current.setNext_person(first);
            }
        }
    }

    /**
     * 方法：显示当前链表中的所有人编号
     */
    public void show(){
        if (first==null){
            System.out.println("当前环形链表为空！");
        }
        Person temp = first;
        while (true){
            if (temp.getNext_person()==first){
                System.out.println("学生编号："+temp.getPid());
                break;
            }else {
                System.out.println("学生编号："+temp.getPid());
                temp = temp.getNext_person();
            }
        }
    }

    /**
     * 方法：实现解决Josephus问题
     * 参数：
     *     k:最开始报数的人
     *     m:每次报数数到m，则有人出列
     *     t:链表中最开始一共有多少人
     */
    public void Josephus(int k, int m, int t){
        addPerson(t);
        if ( k>t){
            System.out.println("k值不能大于t");
        }
        //根据k值，确定第一报数的人current，已经current前一个人pre_current的位置
        Person pre_current = current;
        current = first;
        if (k>1){
            for (int i = 1; i < k; i++){
                current = current.getNext_person();
                pre_current = pre_current.getNext_person();
            }
        }

        //根据m值，开始解决出列问题
        int count = 1;
        while (true){
            for (int j = 1; j < m; j++){
                current = current.getNext_person();
                pre_current = pre_current.getNext_person();
                if (j == m-1){
                    System.out.println("第"+count+"个出队编号:"+current.getPid());
                    pre_current.setNext_person(current.getNext_person());
                    current = current.getNext_person();
                    count++;
                }
            }
            if (current==pre_current){
                System.out.println("第"+count+"个出队编号:"+current.getPid());
                break;
            }
        }


    }

}
