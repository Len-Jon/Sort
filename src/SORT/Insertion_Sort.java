package SORT;
/**
 * 插入排序
 * i: 待插入数坐标，用来控制循环次数，最左边的数已经有序，只用循环右边的数
 * temp：提取待插入数
 * j: 待插入数的坐标，此坐标左边数大于此坐标的数时覆盖此坐标的数，往0移动直至不满足条件
 * 最后一次满足条件后还会-1，所以循环结束后坐标j就是插入位置
 *
 */
public class Insertion_Sort {
    public static void sort(int [] arr){
        int j , temp;
        for(int i = 1 ; i < arr.length ; i++) {
            temp = arr[i];
            for (j = i ; j > 0 && arr[j-1] > temp; j--)
                arr[j] = arr[j - 1];
            arr[j] = temp;
        }
    }
}
