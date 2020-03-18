package SORT;
/**
 * 希尔排序
 * 插入排序增强版
 * 按照增量gap分组直接插入排序
 * 增量每次除以2
 * i: 每次按增量gap分组后，每组的起点
 * j: 比较组的右数，每次根据增量向左跳跃
 * i推着j往右走，j往0走控制插入排序
 */
public class Shell_Sort {
    public static void sort(int [] arr){
            for (int gap = arr.length/2 ; gap > 0 ; gap = gap/2) {//直接插入排序
                for (int i = 0 ; i < arr.length - gap ; i++){   //也可以for(int i = gap ; i < arr.length ; i++){int j = i;...}，这样可以减少两次运算
                    int j = i + gap;    //选定右比较数
                    while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                        SWAP.swap(arr , j , j - gap);
                        j = j - gap;    //左移gap
                    }
                }
            }
        }
}
