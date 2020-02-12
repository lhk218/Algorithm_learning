package 单向环形链表;

/**
 * 需求：1. 使用单向环形链表解决Josephus问题
 *      2. Josephus问题：
 *          设编号为 1，2，… n 的 n 个人围坐一圈，约定编号为 k（1<=k<=n）的人从 1 开始报数，数到 m 的那个人出列，
 *          它的下一位又从 1 开始报数，数到 m 的那个人又出列，依次类推，直到所有人出列为止，由此 产生一个出队编号的序列。
 */
public class Person {
    private int pid;
    private Person next_person;

    public Person() {
    }

    public Person(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Person getNext_person() {
        return next_person;
    }

    public void setNext_person(Person next_person) {
        this.next_person = next_person;
    }

}
