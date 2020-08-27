package 排序算法;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSorting {

    public static void main(String[] args) {

//        int arr[] = {3,9,-1,10,-2};
//        int arr[] = {3,9,-1,10,20};
//        int arr[] = {1,2,3,4,5,6};
        //创建以个80000个随机数据的数组来测试"冒泡排序"的时间复杂度
        int arr[] = new int[80000];
        for (int i = 0 ; i<80000;i++){
            arr[i] = (int) (Math.random() *10000000);
        }
        BubbleArray bubbleArray = new BubbleArray();
        bubbleArray.setArray(arr);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //排序前的时间
        System.out.println("排序前的时间: " + simpleDateFormat.format(new Date()));

        BubbleArray.bubbleSort(bubbleArray);

        //排序后的时间
        System.out.println("排序后的时间: " + simpleDateFormat.format(new Date()));

    }
}

class BubbleArray {
    private int Array[];


    public BubbleArray() {
    }

    public BubbleArray(int[] array) {
        Array = array;
    }

    public int[] getArray() {
        return Array;
    }

    public void setArray(int[] array) {
        Array = array;
    }


    /**
     * 冒泡排序的实现
     * @param bubbleArray
     * @return
     */
    public static int[] bubbleSort(BubbleArray bubbleArray) {
        //设置一个临时变量
        int temp = 0;
        //每一次外循环可以确定一个最大的值，所以极限情况下要进行（Array.length - 1）次循环
        for (int i = 0; i < bubbleArray.Array.length - 1; i++) {
            //设置一个发生交换的标志，有交换则不为0
            int flag = 0;
            for (int j = 0; j < bubbleArray.Array.length - 1 - i; j++) {
                //相邻数字中，把较大的放后面，较小的放前面
                if (bubbleArray.Array[j] > bubbleArray.Array[j + 1]) {
                    //前后换位
                    temp = bubbleArray.Array[j + 1];
                    bubbleArray.Array[j + 1] = bubbleArray.Array[j];
                    bubbleArray.Array[j] = temp;
                    //标志+1
                    flag++;
                }
            }
//            System.out.println("第" + (i+1) + "次排序后的数组:");
//            System.out.println(Arrays.toString(bubbleArray.Array));
            if (flag == 0){
                System.out.println("最终排序后的数组:");
                System.out.println(Arrays.toString(bubbleArray.Array));
                return bubbleArray.Array;
            }
        }
        System.out.println("最终排序后的数组:");
        System.out.println(Arrays.toString(bubbleArray.Array));
        return bubbleArray.Array;
    }
}
