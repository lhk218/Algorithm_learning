package 稀疏数组;

//用二维数组和稀疏数组的转换，来实现一个11行11列五子棋盘及棋子的存盘和读盘功能

public class SparseArray {
    public static void main(String[] args) {
        //创建二维数组，来显示原始11行11列的原始棋盘
        int[][] chessArray1 = new int[11][11];
        chessArray1[1][2] = 1;
        chessArray1[2][3] = 2;
        chessArray1[4][1] = 1;
        chessArray1[8][6] = 2;

        //输出chessArray数组查看是否创建正确
   /*     for (int[] row : chessArray1) {
            for (int value : row) {
                System.out.printf("%d\t",value);
            }
            System.out.println();
        }*/

        //遍历chessArray拿到有效值的个数
        int value_count = 0 ;
        for(int i = 0; i < chessArray1.length; i++) {
            for (int j = 0; j < chessArray1[i].length; j++){
                if (chessArray1[i][j] != 0) {
                    value_count++;
                }
            }
        }
        //检验有效值个数是否正确
       // System.out.println(value_count);

        //创建稀疏数组
        int[][] sparseArray = new int[value_count + 1][3];
        sparseArray[0][0] = chessArray1.length;
        sparseArray[0][1] = chessArray1[0].length;
        sparseArray[0][2] = value_count;
        //遍历原始二维数组，用来完成稀疏数组的赋值
        int x = 1 ;
        for (int i = 1; i < chessArray1.length; i++) {
            for (int j = 0; j < chessArray1[i].length; j++) {
                if (chessArray1[i][j] != 0) {
                    sparseArray[x][0] = i;
                    sparseArray[x][1] = j;
                    sparseArray[x][2] = chessArray1[i][j];
                    x++;
                }
            }
        }

        //上述步骤已创建好稀疏数组sparseArray，用循环输出检查
 /*       for (int[] row : sparseArray) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }*/

        //建立新的二维数组，将稀疏数组的数据变成二维数组
        int[][] chessArray2 = new int[sparseArray[0][0]][sparseArray[0][1]];
        int j = 0;
        for (int i = 1; i < sparseArray[0][2] + 1; i++) {
            chessArray2[sparseArray[i][j]][sparseArray[i][j+1]] = sparseArray[i][j+2];
        }

        //输出新的二维数组检查是否正确
        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

    }
}
