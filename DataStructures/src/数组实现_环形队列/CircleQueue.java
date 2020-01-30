package 数组实现_环形队列;



public class CircleQueue {

    /***
     * 这里用front和rear作为环形队列首位的标记位，具体含义如下：
     * front：表示队列第一个元素所在的为止，从0开始到real_size + 1；
     * rear：表示队列最后一个元素的后一位；
     * queue_size和real_size：这里之所以要区分queue_size和real_size是因为当用户创建一个环形队列时，需要输入期望的容量，
     *                       比如输入queue_size = 7表示能存储7个元素的队列，但是在实现过程中其实我用到了8个位置，因为
     *                       有一个预留位置给rear避免溢出，所以实际的real_size = queue_size + 1；
     *
     */
    private int front;
    private int rear;
    private int queue_size;
    private int real_size;
    private int[] arr_queue;

    public CircleQueue(int queue_size){
        this.queue_size = queue_size;
        real_size = queue_size + 1;
        front = 0;
        rear = 0;
        arr_queue = new int[real_size];
    }

    /***
     * 方法：判断队列是否为空，判断条件为rear == front
     */
    public boolean isEmpty(){
        boolean result = false;
        if (rear==front){
            result = true;
        }
        return result;
    }

    /***
     * 方法：判断队列是否满，判断条件为(rear+1) % real_size == front;
     */
    public boolean isFull(){
        boolean result = false;
        if ((rear+1) % real_size == front){
            result = true;
        }
        return result;
    }

    /***
     * 方法：向队列添加元素
     */
    public void add(int input){
        if (!isFull()){
            arr_queue[rear] = input;
            rear = (rear + 1) % (real_size);
        }else {
            System.out.println("队列已满，无法添加元素！");
        }
    }

    /***
     * 方法：删除队列元素，默认从头部删除
     */
    public int delete(){
        int num_del = 0;
        if (isEmpty()){
            System.out.println("队列为空，无法删除元素！");
        } else {
            num_del = arr_queue[front];
            front = (front + 1 ) % real_size;
        }
        return num_del;
    }


    /***
     *  方法：查看队列
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
        }else {
            System.out.println("队列的元素分别为：");
            if (front < rear){
                for (int i = front; i < rear; i++){
                    System.out.println(arr_queue[i]);
                }
            }else {
                for (int i = front; i < (rear + real_size); i++){
                    System.out.println(arr_queue[i%real_size]);
                }
            }
        }
    }

}
